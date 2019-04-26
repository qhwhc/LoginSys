package com.ccc.loginsys.service;


public interface Md5Service {
    /*加盐加密*/
    public String md5BySalt(String password, String salt, int hashIterations);
}
