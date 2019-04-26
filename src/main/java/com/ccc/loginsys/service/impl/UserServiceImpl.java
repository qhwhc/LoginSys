package com.ccc.loginsys.service.impl;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import com.ccc.loginsys.common.pageUtil.Page;
import com.ccc.loginsys.dao.UserDao;
import com.ccc.loginsys.dto.User;
import com.ccc.loginsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findPage(Page<?> page) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> find(Map<?, ?> paraMap) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User selectByPrimaryKey(Serializable id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(User entity) {
        return userDao.insert(entity);
    }

    @Override
    public int updateByPrimaryKey(User entity) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Serializable id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(List<?> ids) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isExit(String usercode) {
        String str = userDao.isExit(usercode);
        if (usercode.equals(str)) {
            return true;
        }
        return false;
    }

    @Override
    public User findByUserCode(String usercode) {
        return userDao.findByUserCode(usercode);
    }

}
