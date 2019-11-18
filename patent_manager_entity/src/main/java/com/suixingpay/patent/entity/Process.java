package com.suixingpay.patent.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 17:51
 * @version: V1.0
 */
@Data
public class Process {
    /** 流程表主键id **/
    private Long processId;
    /** 对应专利id **/
    private Long patentId;
    /** 流程更新时间 **/
    private Date processTime;
    /** 程序状态 **/
    private Integer processState;
}
