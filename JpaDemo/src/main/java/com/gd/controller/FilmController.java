package com.gd.controller;

import com.gd.dao.FilmDao;
import com.gd.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

/**
 * Created by 郭 on 2018/1/29.
 */

@RestController
public class FilmController {
    @Autowired
    private FilmDao filmDao;
    //查询单个
    @GetMapping("/film")
    public Film findOne(){
        Film f=filmDao.findOne(2);
        return f;
    }
  // 查询所有信息
    @RequestMapping("/filmall")
    @Transactional(readOnly = true)
    public List<Film> findAll(){
        List<Film> fs=filmDao.findAll();
        return filmDao.findAll();
    }
}
