package com.suixingpay.tp.service;

import com.suixingpay.patent.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    User login(@Param("userStaff") String userStaff, @Param("passWord") String passWord);
}
