package com.gd.base.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;


/**
 * 通用Mapper
 * Created by Administrator on 2018/7/6.
 */
public interface Mapper<T> extends BaseMapper<T>,ConditionMapper<T>,IdsMapper<T>,InsertListMapper<T> {

}
