package com.hehe.dao.mapper;

import com.framework.generic.GenericMapper;
import com.hehe.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:43
 * @Description:
 */
@Mapper
public interface UserMapper extends GenericMapper<User> {
}
