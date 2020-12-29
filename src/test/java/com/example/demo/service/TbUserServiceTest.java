package com.example.demo.service;

import com.example.demo.entity.TbUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class TbUserServiceTest {
    @Autowired
    private TbUserService tbUserService;
    @Test
    void insintOne() {
        TbUser tbUser= new TbUser();
        tbUser.setPassword("123");
        tbUser.setUsername("hhy");
        tbUserService.insintOne(tbUser);
    }

    @Test
    void selectOne() {
        TbUser tbUser = tbUserService.selectOne(5);
        System.out.println(tbUser);
    }
}