package com.example.demo.controller;


import com.example.demo.dto.LoginDTO;
import com.example.demo.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * 账号表 前端控制器
 * </p>
 *
 * @author zhf
 * @since 2021-02-05
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    /**
     * 用户登录
     * @param name
     * @param passWord
     * @author OceanHan
     * @date 2021/2/5 14:56
     * @return java.lang.String
     */
    @RequestMapping("/login")
    public String login(String name, String password, HttpSession session, RedirectAttributes attributes){
        LoginDTO loginResult = accountService.login(name, password);
        if(loginResult.getError() == null){
            session.setAttribute("accountSession",loginResult.getAccount());
        }else {
            attributes.addAttribute("error",loginResult.getError());
        }

        return loginResult.getPath();
    }

}
