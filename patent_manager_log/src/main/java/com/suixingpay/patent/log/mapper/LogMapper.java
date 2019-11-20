package com.suixingpay.patent.log.mapper;

import com.suixingpay.patent.entity.Log;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface LogMapper {

    public int addUserMessageLog(Log log);


}
