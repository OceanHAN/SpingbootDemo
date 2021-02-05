package com.example.demo.dto;

import com.example.demo.entity.Account;
import lombok.Data;

/**
 * @author OceansHan
 */
@Data
public class LoginDTO {

    /**
     * 重定向或跳转的路径
     */
    private String path;

    /**
     * 错误提示信息
     */
    private String error;

    /**
     * 当前登录人的信息
     */
    private Account account;

}
