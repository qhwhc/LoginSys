package com.ccc.loginsys.dao;

import com.ccc.loginsys.common.base.BaseDao;
import com.ccc.loginsys.dto.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseDao<User> {
    //	判断用户是否已存在
    public String isExit(String usercode);

    //	根据帐号查询用户
    public User findByUserCode(String usercode);
}