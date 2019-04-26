package com.ccc.loginsys.shiro.realm;

import java.util.ArrayList;
import java.util.List;

import com.ccc.loginsys.dto.User;
import com.ccc.loginsys.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Md5Realm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    @Override
    public void setName(String name) {
        super.setName("userRealm");
    }

    /*用户认证*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userCode = (String) token.getPrincipal();
        System.out.println(userService);
        User user = userService.findByUserCode(userCode);
        if (user == null) {
            return null;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userCode, user.getPassword(), ByteSource.Util.bytes(user.getSalt()), this.getName());
        return simpleAuthenticationInfo;
    }

    /*用户授权，认证通过后进行授权*/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //String userCode = (String) principals.getPrimaryPrincipal();

        /*连接数据库获取信息*/
        List<String> permissions = new ArrayList<String>();
        permissions.add("user:create");
        permissions.add("user:delete");

        /*将授权信息加入认证器*/
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }
}
