package com.gd.controller;

import com.gd.dao.StudentDao;
import com.gd.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 郭 on 2018/1/29.
 */
@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("/s")
    public void saveStudent(){
        Student s = new Student("张三",20);
        studentDao.save(s);

    }
}
