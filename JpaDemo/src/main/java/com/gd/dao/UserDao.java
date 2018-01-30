package com.gd.dao;

import com.gd.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 郭 on 2018/1/29.
 */

public interface UserDao extends JpaRepository<User,Integer> {
    /**
     *
     * @param name User的姓名
     * @param age User的年龄
     * @param id User的Id
     * @return 一个User对象
     */
    public User findByNameAndAgeAndId(String name, Integer age,Integer id);

    /**
     * @param naem User的姓名
     * @return 一个User对象
     */
    public User findByName(String naem);

    /**\
     * @param name User的姓名
     * @param age User的年龄
     * @return 一个User对象
     */
    public User findByNameOrAge(String name,Integer age);

    /**
     * @param mix 查询的最小值
     * @return 大于mix的所有数据
     */
    public List<User> findByAgeGreaterThan(int mix);

    /**
     *
     * @param name 模糊查询的字符串
     * @return 查询的所有User对象
     */
    public List<User> findByNameLike(String name);


}
