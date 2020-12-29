package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @author OceansHan
 * @date 2020/10/12 9:27
 * 接口
 */
public interface UserService {

    List<User> findAll();

    Integer insintOne(User user);
}
