package com.nasoril.backend.controller;


import com.nasoril.backend.pojo.Result;
import com.nasoril.backend.pojo.User;
import com.nasoril.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        User u = userService.findByUserName(username);

        if (u == null) {
            userService.register(username,password);
            return Result.success();
        }else{
            return Result.error("用户名已被占用");
        }
    }
}
