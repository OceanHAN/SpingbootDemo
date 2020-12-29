package com.example.demo.service.imp;

import com.example.demo.entity.TbUser;
import com.example.demo.mapper.TbUserDao;
import com.example.demo.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * @author OceansHan
 * @date 2020/12/3 16:22
 */
@Service("TbUserService")
public class TbuserServiceImp implements TbUserService {

    private final TbUserDao tbUserDao;

    public TbuserServiceImp(TbUserDao tbUserDao) {
        this.tbUserDao = tbUserDao;
    }

    @Override
    public Integer insintOne(TbUser tbUser) {
        return tbUserDao.insert(tbUser);
    }

    @Override
    public TbUser selectOne(Integer id) {
        return tbUserDao.selectByPrimaryKey(id);
    }


}
