package com.example.demo.service.impl;

import cn.hutool.crypto.digest.MD5;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Account;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author zhf
 * @since 2021-02-05
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public LoginDTO login(String username, String passWord) {
        LoginDTO loginDTO = new LoginDTO();
        //默认失败路径
        loginDTO.setPath("redirect:/");
        //根据用户名查询一条数据
        Account account = lambdaQuery().eq(Account::getUsername, username).one();
        if(account == null){
            loginDTO.setError("用户名不存在");
            return loginDTO;
        }
        //利用糊涂工具类库加盐
        MD5 md5 = new MD5(account.getSalt().getBytes());
        String digestHex = md5.digestHex(passWord);

        if(!digestHex.equals(account.getPassword())){
            loginDTO.setError("密码错误");
            return loginDTO;
        }
        //把用户信息存进去
        loginDTO.setAccount(account);
        loginDTO.setPath("login/main");

        return loginDTO;
    }
}
