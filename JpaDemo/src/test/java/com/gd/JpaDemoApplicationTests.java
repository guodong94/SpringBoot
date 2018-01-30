package com.gd;

import com.gd.dao.FilmDao;
import com.gd.pojo.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private FilmDao filmDao;
	@Test
	public void findOne(){
	//	Film f=filmDao.findAll()
		List<Film> fs = filmDao.findAll();
	//	fs.add(f);
		System.out.println(fs);
		//return fs;
	}

}
