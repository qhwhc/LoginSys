package com.ccc.loginsys.interfaces.impl;

import com.ccc.loginsys.constants.responseCode.LoginConstant;
import com.ccc.loginsys.interfaces.LoginInterface;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;


@Controller
public class LoginInterfaceImpl implements LoginInterface {

    @Override
    public String Login(String username, String password) {
// 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
// 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
//			执行认证提交,并抛出出错认证异常
            subject.login(token);
        } catch (UnknownAccountException e) {
//			帐号不存在异常
            return LoginConstant.LOGINCODE.get("0001");
        } catch (IncorrectCredentialsException e) {
//			密码错误
            return LoginConstant.LOGINCODE.get("0002");
        }
        boolean authenticated = subject.isAuthenticated();
        if (authenticated) {
            return LoginConstant.LOGINCODE.get("0000");
        }
        return LoginConstant.LOGINCODE.get("9999");
    }

}
