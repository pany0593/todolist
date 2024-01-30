package com.pany.service.impl;

import com.pany.mapper.UserMapper;
import com.pany.pojo.User;
import com.pany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        User user = userMapper.findByName(name);
        return user;
    }

    @Override
    public User findById(Integer userId) {
        User user = userMapper.findById(userId);
        return user;
    }

    @Override
    public void register(String name,String email, String pwd) {
        userMapper.add(name,email, pwd);
    }

}
