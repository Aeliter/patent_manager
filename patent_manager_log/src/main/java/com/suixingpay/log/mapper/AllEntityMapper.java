package com.suixingpay.log.mapper;

import com.suixingpay.patent.entity.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface AllEntityMapper {

    public User getUpdataUser(User user);
}
