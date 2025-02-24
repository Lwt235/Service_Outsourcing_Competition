package com.competition.backend.service;


import com.competition.backend.pojo.User;

public interface UserService {
    User findByUserName(String username);

    void register(String username, String password);
}
