package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 17:48
 * @version: V1.0
 */
@Data
public class Inventor {
    /** 专利发明人表主键 **/
    private Long inventorId;
    /** 专利发明人id **/
    private Long userId;
    /** 专利主键 **/
    private Long patentId;
    /** 发明人状态 **/
    private Integer inventorState;
}
