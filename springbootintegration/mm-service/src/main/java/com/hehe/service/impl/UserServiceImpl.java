package com.hehe.service.impl;


import com.hehe.dao.UserDao;
import com.hehe.entity.user.User;
import com.hehe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yule
 * @Date: 2018/8/6 0006 14:21
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser() {
        return userDao.selectAll();
    }

}
