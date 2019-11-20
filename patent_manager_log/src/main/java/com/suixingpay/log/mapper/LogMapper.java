package com.suixingpay.log.mapper;

import com.suixingpay.entity.Log;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface LogMapper {

    public int addUserMessageLog(Log log);


}
