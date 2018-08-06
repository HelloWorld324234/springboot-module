package com.framework.generic;

import java.util.Date;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:01
 * @Description: 约定通用实体类模型必须实现的方法
 */
public interface IGenericModel<PK> {

    PK getId();

    void setId(PK var1);

    String getInsertUser();

    void setInsertUser(String var1);

    Date getInsertTime();

    void setInsertTime(Date var1);

    String getUpdateUser();

    void setUpdateUser(String var1);

    Date getUpdateTime();

    void setUpdateTime(Date var1);

    void init();


}
