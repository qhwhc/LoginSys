package com.ccc.loginsys.service;


import com.ccc.loginsys.common.base.BaseService;
import com.ccc.loginsys.dto.User;

public interface UserService extends BaseService<User> {
    //	判断用户是否已存在
    public boolean isExit(String usercode);

    //	根据帐号查询用户
    public User findByUserCode(String usercode);
}
