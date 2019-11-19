package com.suixingpay.tp.service.impl;

import com.suixingpay.patent.entity.User;
import com.suixingpay.tp.mapper.UserMapper;
import com.suixingpay.tp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> get() {
        return userMapper.get();
    }
}
