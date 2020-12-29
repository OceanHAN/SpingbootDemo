package com.example.demo.mapper;

import com.example.demo.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}