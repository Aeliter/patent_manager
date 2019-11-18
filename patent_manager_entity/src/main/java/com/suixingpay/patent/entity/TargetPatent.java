package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 18:05
 * @version: V1.0
 */
@Data
public class TargetPatent {
    /** 指标编号 **/
    private Long targetId;
    /** 专利编号 **/
    private Long patentId;
}
