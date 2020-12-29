package com.example.demo.service.imp;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OceansHan
 * @date 2020/10/12 9:29
 */
@Service("userService")
public class UserServiceImp implements UserService {
    private final UserMapper userMapper;

    public UserServiceImp(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public Integer insintOne(User user) {
        return userMapper.insintOne(user);
    }
}
