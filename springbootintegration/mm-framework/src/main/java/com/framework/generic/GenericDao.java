package com.framework.generic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:26
 * @Description:
 */
public abstract class GenericDao<E extends IGenericModel, PK> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    protected GenericMapper<E> mapper;

    private Class<E> entityClass;

    public GenericDao(GenericMapper<E> genericMapper) {
        this.mapper = genericMapper;
        this.entityClass = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public List<E> selectAll() {
        try {
            return this.mapper.selectAll();
        } catch (Exception var1) {
            logger.info("Exception:{}", var1);
            return null;
        }
    }


}
