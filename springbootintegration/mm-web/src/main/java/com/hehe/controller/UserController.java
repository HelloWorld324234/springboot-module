package com.hehe.controller;

import com.hehe.entity.common.R;
import com.hehe.entity.user.User;
import com.hehe.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 14:28
 * @Description:
 */
@RestController
@Slf4j
@Api(description = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @ApiOperation("查询所有")
    public R<List<User>> listUser() {
        List<User> users = userService.listUser();
        users.forEach(user -> {
            log.info("{}", user.toString());
        });
        return R.isOk().data(users);
    }

}
