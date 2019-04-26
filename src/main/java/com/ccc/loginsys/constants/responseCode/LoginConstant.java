package com.ccc.loginsys.constants.responseCode;

import java.util.HashMap;
import java.util.Map;

public class LoginConstant {
    public static final Map<String, String> LOGINCODE = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;

        {
            put("0000", "0000");
            put("0001", "用户名错误！");
            put("0002", "密码错误！");
            put("9999", "未知错误！");
        }
    };
}
