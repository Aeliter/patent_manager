package com.suixingpay.tp.mapper;

import com.suixingpay.patent.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 登录验证
     * @param userName
     * @param password`
     * @return
     */
     User login(@Param("userStaff") String userStaff, @Param("passWord") String passWord);
}
