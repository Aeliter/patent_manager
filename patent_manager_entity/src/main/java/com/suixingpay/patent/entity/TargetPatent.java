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
    /** 指标专利编号 **/
    private Long tpId;
    /** 指标编号 **/
    private Long targetId;
    /** 专利编号 **/
    private Long patentId;
    /**指标实体类**/
    private Target target;
    /***专利实体类*/
    private Patent patent;
}
