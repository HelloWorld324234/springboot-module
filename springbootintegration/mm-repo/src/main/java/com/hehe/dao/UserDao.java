package com.hehe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hehe.entity.user.User;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 11:55
 * @Description:
 */
public interface UserDao extends JpaRepository<User, String> {

}
