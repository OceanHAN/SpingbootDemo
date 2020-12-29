package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author OceansHan
 * @date 2020/10/10 17:28
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "123456";
    }


    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
