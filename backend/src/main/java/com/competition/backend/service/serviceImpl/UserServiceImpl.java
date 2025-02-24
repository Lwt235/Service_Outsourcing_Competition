package com.competition.backend.service.serviceImpl;


import com.competition.backend.mapper.UserMapper;
import com.competition.backend.pojo.User;
import com.competition.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User user = userMapper.findByUserName(username);
        return user;
    }

    @Override
    public void register(String username, String password) {
        userMapper.add(username,password);
    }
}
