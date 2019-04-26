package com.ccc.loginsys.interfaces.impl;

import java.util.UUID;

import com.ccc.loginsys.constants.responseCode.UserConstant;
import com.ccc.loginsys.dto.User;
import com.ccc.loginsys.interfaces.UserInterface;
import com.ccc.loginsys.service.Md5Service;
import com.ccc.loginsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserInterfaceImpl implements UserInterface {
    @Autowired
    private Md5Service md5Service;
    @Autowired
    private UserService userService;

    @Override
    @RequestMapping("register/{usercode}/{username}/{password}")
    public String Register(@PathVariable("usercode") String usercode, @PathVariable("username") String username, @PathVariable("password") String password) {
//		密码长度限制
        if (password.length() < 6 || password.length() > 18) {
            return UserConstant.USERREGISTERCODE.get("0002");
        }
//		用户已注册
        if (userService.isExit(usercode)) {
            return UserConstant.USERREGISTERCODE.get("0001");
        }
        String salt = String.valueOf(System.currentTimeMillis());
        User user = new User();
        user.setId(UUID.randomUUID().toString())
                .setLocked("0")
                .setUsercode(usercode)
                .setUsername(username)
                .setSalt(salt)
                .setPassword(md5Service.md5BySalt(password, salt, 1));
        userService.insert(user);
        return UserConstant.USERREGISTERCODE.get("0000");
    }

    @Override
    public String modifyPassWd(String username, String oldPassword, String newPassword) {
        // TODO Auto-generated method stub
        return null;
    }
}
