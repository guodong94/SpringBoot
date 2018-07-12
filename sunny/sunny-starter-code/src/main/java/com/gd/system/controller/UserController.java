package com.gd.system.controller;

import com.gd.base.Result;
import com.gd.constants.BaseEnums;
import com.gd.constants.Constants;
import com.gd.system.dto.User;
import com.gd.util.Dates;
import com.gd.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/5.
 */
@RestController
@RequestMapping
@Api(value = "用户Controller",tags = "用户操作接口")
public class UserController   {
    private static List<User> userList = new ArrayList<>();

    // 先静态模拟数据
    static {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setUsername("lufei");
        user1.setNickname("蒙奇D路飞");
        user1.setBirthday(Dates.parseDate("2000-05-05"));
        user1.setSex(Constants.Sex.MALE);
        user1.setEnabled(Constants.Flag.YES);
        userList.add(user1);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("nami");
        user2.setNickname("娜美");
        user2.setBirthday(Dates.parseDate("2000/7/3"));
        user2.setSex(Constants.Sex.FEMALE);
        user2.setEnabled(Constants.Flag.YES);
        userList.add(user2);
    }

    @ApiOperation(value = "获取全部用户",notes = "aaaaa")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET )
    public Result queryAll(){
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
    }

    @ApiOperation(value = "获取用户信息",notes = "根据URL的id获取用户信息")
    @ApiImplicitParam(name = "userId",value = "用户Id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value = "/queryOne/{userId}",method = RequestMethod.GET)
    public Result queryOne(@PathVariable Long userId){
        User user = null;
        for(User u : userList){
            if(u.getUserId().longValue() == userId){
                user = u;
            }
        }
        return Results.successWithData(user);
    }
}
