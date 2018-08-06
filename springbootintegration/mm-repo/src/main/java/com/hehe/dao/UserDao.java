package com.hehe.dao;

import com.framework.generic.GenericDao;
import com.framework.generic.GenericMapper;
import com.hehe.dao.mapper.UserMapper;
import com.hehe.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 11:55
 * @Description:
 */
@Repository
public class UserDao extends GenericDao<User, String> {

    private UserMapper userMapper;

    @Autowired
    public UserDao(UserMapper userMapper) {
        super(userMapper);
        this.userMapper = userMapper;
    }
}
