package com.framework.generic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:09
 * @Description: 定义底层通用实体类
 */
@Entity
public abstract class GenericModel<PK> implements IGenericModel<PK>, Serializable {

    @Id
    PK id;

    String insertUser;

    @OrderBy("desc")
    Date insertTime;

    String updateUser;

    Date updateTime;

    @Override
    public PK getId() {
        return this.id;
    }

    @Override
    public void setId(PK id) {
        this.id = id;
    }

    @Override
    public String getInsertUser() {
        return this.insertUser;
    }

    @Override
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser;
    }

    @Override
    public Date getInsertTime() {
        return this.insertTime;
    }

    @Override
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String getUpdateUser() {
        return this.updateUser;
    }

    @Override
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public Date getUpdateTime() {
        return this.getUpdateTime();
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public void init() {
        Date date = new Date();
        this.setId(this.generateId());
        this.setInsertTime(date);
        this.setInsertUser("insertUser");
        this.setUpdateUser((String) null);
        this.setUpdateTime((Date) null);
        this.setDefault();
    }

    protected void setDefault() {
    }


    /**
     * 自动生成主键的方法
     *
     * @return
     */
    protected abstract PK generateId();
}
