package com.framework.generic;

import java.util.UUID;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:21
 * @Description: 自动生成主键
 */
public abstract class GenericGuidModel extends GenericModel<String> {
    @Override
    protected String generateId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
