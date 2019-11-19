package com.suixingpay.tp.mapper;

import com.suixingpay.patent.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> get();

}
