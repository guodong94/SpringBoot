package com.gd.system.controller;

import com.gd.base.Result;
import com.gd.constants.BaseEnums;
import com.gd.system.dto.User;
import com.gd.system.service.UserService;
import com.gd.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/7/5.
 */
//@RestController
//@RequestMapping("sys/user")
//@Api(value = "用户Controller",tags = "用户操作接口")
public class UserController1 {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取全部用户",notes = "获取全部用户")
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET )
    public Result queryAll(){
        List<User> userList=userService.selectAll();
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
    }

    @ApiOperation(value = "获取用户信息",notes = "根据URL的id获取用户信息")
    @ApiImplicitParam(name = "userId",value = "用户Id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value = "/queryOne/{userId}",method = RequestMethod.GET)
    public Result queryOne(@PathVariable Long userId){
        User user= (User) userService.get(userId);
        return Results.successWithData(user);
    }

    @ApiOperation(value = "保存用户信息",notes = "保存用户信息")
    @PostMapping("/save")
    public Result save(User user){
        userService.insert(user);
        return Results.failureWithData(user);
    }
    @ApiOperation(value = "更新用户信息",notes = "更新用户信息")
    @PostMapping("/update")
    public Result update(User user){
        userService.update(user);
        return Results.successWithData(user);
    }
    @ApiOperation(value = "删除用户信息",notes = "删除用户信息")
    @DeleteMapping("/delete")
    public Result delete(User user){
        userService.delete(user);
        return Results.success();
    }
    @ApiOperation(value = "根据用户Id删除用户信息",notes = "根据用户Id删除用户信息")
    public Result deleteById(Long id){
        userService.delete(id);
        return Results.success();
    }
}
