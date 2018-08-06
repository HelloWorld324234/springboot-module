package com.framework.generic;

import org.apache.ibatis.annotations.InsertProvider;
import tk.mybatis.mapper.additional.insert.InsertListProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 16:22
 * @Description: 底层通用mapper
 */
public interface GenericMapper<E> extends Mapper<E> {

    @InsertProvider(
            type = InsertListProvider.class,
            method = "dynamicSQL"
    )
    int insertList(List<E> var1);

}
