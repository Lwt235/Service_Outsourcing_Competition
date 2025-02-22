package com.nasoril.backend.service;


import com.nasoril.backend.pojo.User;

public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);
}
