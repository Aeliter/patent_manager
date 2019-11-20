package com.suixingpay.tp;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author:
 * @date: 2019-11-19 11:36
 * @version: V1.0
 */
@SpringBootApplication
public class TpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TpApplication.class, args);
    }
}
