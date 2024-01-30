package com.pany.service;

import com.pany.pojo.User;

public interface UserService {
    User findByName(String name);

    void register(String name,String email, String pwd);

    User findById(Integer userId);
}
