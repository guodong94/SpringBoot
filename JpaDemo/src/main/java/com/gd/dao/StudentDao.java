package com.gd.dao;

import com.gd.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

/**
 * Created by 郭 on 2018/1/29.
 */
@Repository
@EnableJpaRepositories
public interface StudentDao extends JpaRepository<Student,Integer> {
}
