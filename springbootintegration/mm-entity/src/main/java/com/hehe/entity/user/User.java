package com.hehe.entity.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 11:40
 * @Description:
 */
@Data
@Entity
@Table(name = "T_USER")
public class User {

    @Id
    @Column(name = "USERID")
    private String userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

}
