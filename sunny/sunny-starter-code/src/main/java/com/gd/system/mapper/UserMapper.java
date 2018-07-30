package com.gd.system.mapper;

import com.gd.system.dto.User;
import org.springframework.stereotype.Component;

/**
 * UserMapper
 * Created by Administrator on 2018/7/26.
 */
@Component
public interface UserMapper extends tk.mybatis.mapper.common.BaseMapper<User>, tk.mybatis.mapper.common.ConditionMapper<User>, tk.mybatis.mapper.common.IdsMapper<User>, tk.mybatis.mapper.common.special.InsertListMapper<User> {
}
