package com.example.demo.service;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 账号表 服务类
 * </p>
 *
 * @author zhf
 * @since 2021-02-05
 */
public interface AccountService extends IService<Account> {
    /**
     * 登录
     * @param name
     * @param passWord
     * @author OceanHan
     * @date 2021/2/5 15:02
     * @return void
     */
    LoginDTO login(String name, String passWord);

}
