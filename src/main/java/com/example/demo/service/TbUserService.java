package com.example.demo.service;

import com.example.demo.entity.TbUser;

/**
 * @author OceansHan
 * @date 2020/12/3 16:20
 */
public interface TbUserService {

   Integer insintOne(TbUser tbUser);

   TbUser selectOne(Integer id);

}
