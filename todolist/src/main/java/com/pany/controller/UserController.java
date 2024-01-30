package com.pany.controller;

import com.pany.pojo.Result;
import com.pany.pojo.User;
import com.pany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String name,String email, String pwd) {//没上过滤
        User user = userService.findByName(name);
        if (user == null) {
            userService.register(name,email,pwd);
            return Result.success();
        } else {
            return Result.error("用户名已被占用");
        }
    }

    @PostMapping("/login")
    public Result login(String name, String pwd) {
        User user = userService.findByName(name);
        if (user == null) {
            return Result.error("用户名不存在");
        }
        if(user.getPwd().equals(pwd)){                     //明文密码
            return Result.success(user);    //token
        }else{
            return Result.error("密码错误");
        }
    }
}
