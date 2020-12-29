package com.example.demo.service;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void findAll() {
        List<User> allList = userService.findAll();
        for (int i = 0;i<allList.size();i++){
            System.out.println(allList.get(i).getUsername());
            System.out.println(allList.get(i).getPassword());
        }
    }

    @Test
    void insintOne() {
        User user = new User();
        user.setUsername("小米");
        user.setPassword("123456");
        Integer integer = userService.insintOne(user);
        System.out.println(integer);
    }
}