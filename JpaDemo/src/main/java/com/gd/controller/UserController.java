package com.gd.controller;

import com.gd.dao.UserDao;
import com.gd.pojo.Film;
import com.gd.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by 郭 on 2018/1/29.
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    //查询单个
    @RequestMapping("/user")
    @ResponseBody
    public User getUser(){
        User user=userDao.findOne(1);
        return user;
    }
    //保存1000条数据
    @RequestMapping("save")
    public String saveOne(){
        for (int i=0;i<1000;i++) {
            User user = new User();
            user.setAge(i);
            user.setName("张三"+i);
            userDao.save(user);
        }
        return "执行成功";
    }
    //查询所有
    @RequestMapping("userall")
    public List<User> findUserAll(){
        List<User> us = userDao.findAll();

        for (User f: us) {
            System.out.println(f);
        }
       return us;
    }

    //删除数据
    @RequestMapping("duser")
    public String deleteUser(){
        ;userDao.delete(5);
        return "删除成功";
    }
    //更新数据
    @RequestMapping("updateuser")
    public String UpdateUsers(){
        User user=new User();
        user.setId(2);
        user.setName("李四");
        user.setAge(16);
        userDao.save(user);
        return "更新成功";
    }
    //通过name，age，id查询
    @RequestMapping("/findna")
    public User findUser1(){
        return userDao.findByNameAndAgeAndId("张三9",9,11);
    }
    //通过name查询
    @RequestMapping("findbyname")
    public User findByName(){
        return userDao.findByName("李四");
    }
    //查询name或age
    @RequestMapping("findbynameorage")
    public User findNameOrAge(){
        return userDao.findByNameOrAge("张三78",null);
    }
    //查询大于min
    @RequestMapping("findgtage")
    public List<User> findByAgeGreaterThan(){
        return userDao.findByAgeGreaterThan(990);
    }
    //模糊查询
    @RequestMapping("likename")
    public List<User> findLikeName(){
        return userDao.findByNameLike("张%");
    }

}
