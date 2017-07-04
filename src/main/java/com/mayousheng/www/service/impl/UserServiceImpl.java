package com.mayousheng.www.service.impl;

import com.mayousheng.www.mapper.UserMapper;
import com.mayousheng.www.pojo.User;
import com.mayousheng.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}