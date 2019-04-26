package com.ccc.loginsys.constants.responseCode;

import java.util.HashMap;
import java.util.Map;

public class UserConstant {
    public static final Map<String, String> USERREGISTERCODE = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("0000", "注册成功！");
            put("0001", "用户已注册！");
            put("0002", "密码不符合！");
        }
    };
}
