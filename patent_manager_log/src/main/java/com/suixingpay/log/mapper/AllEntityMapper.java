package com.suixingpay.log.mapper;

import com.suixingpay.entity.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface AllEntityMapper {

    public User getUpdataUser(User user);
}
