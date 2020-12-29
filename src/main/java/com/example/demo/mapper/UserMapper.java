package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author OceansHan
 * @date 2020/10/12 13:30
 */
@Mapper
public interface UserMapper {
    /*查询所有的数据*/
    List<User> findAll();

    /*增加一条数据*/
    Integer insintOne(User user);
}
