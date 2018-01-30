package com.gd.controller;

import com.gd.dao.FilmDao;
import com.gd.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 郭 on 2018/1/28.
 */
@RestController
public class FilmController  {

    @Autowired
    private FilmDao filmDao;
    @RequestMapping("/film")
    public Film getFilms(){
        System.out.println("方法进来了");
        Film film = filmDao.findOne(1);
        //System.out.println(film);
        return film;
    }
    @RequestMapping("/save")
    @ResponseBody
    public void saveFilm(){

    }
}
