package com.hehe.entity.user;

import com.framework.generic.GenericGuidModel;
import lombok.Data;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 11:40
 * @Description:
 */
@Data
public class User extends GenericGuidModel {

    private String name;

    private String address;

}
