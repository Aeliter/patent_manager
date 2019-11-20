package com.suixingpay.patent.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 17:49
 * @version: V1.0
 */
@Data
public class Log {
    /** 日志表主键 **/
    private Long logId;
    /** 日志信息 **/
    private String logInfo;
    /** 时间 **/
    private Date logTime;
    /** 操作人 **/
    private Long userId;
    /** 操作类型 **/
    private Integer logType;
    /** 操作方法 **/
    private String logMethod;
    /** 日志修改人信息以及修改前信息 **/
    private String logUserMessage;
    /** 日志状态 **/
    private Integer logState;
}
