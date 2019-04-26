package com.ccc.loginsys.service.impl;

import com.ccc.loginsys.service.Md5Service;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;


@Service
public class Md5ServiceImpl implements Md5Service {
    @Override
    public String md5BySalt(String password, String salt, int hashIterations) {
        Md5Hash md5Hash = new Md5Hash(password, salt, hashIterations);
        return md5Hash.toString();
    }
}
