package com.suixingpay.tp.service.impl;

import com.suixingpay.patent.entity.User;
import com.suixingpay.tools.MD5Util;
import com.suixingpay.tp.mapper.UserMapper;
import com.suixingpay.tp.service.UserService;
import org.apache.catalina.mbeans.UserMBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper  userMapper;
   public User login(@Param("userStaff")String userStaff,@Param("passWord")String passWord)
   {
       //使用md5对密码加密
       String passwordMd5 = MD5Util.MD5Encode(passWord, "UTF-8");
       return userMapper.login(userStaff,passwordMd5);
   }
}
