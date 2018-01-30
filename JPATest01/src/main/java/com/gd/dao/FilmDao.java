package com.gd.dao;

import com.gd.pojo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 郭 on 2018/1/28.
 */
public interface FilmDao extends JpaRepository<Film,Integer>{

}
