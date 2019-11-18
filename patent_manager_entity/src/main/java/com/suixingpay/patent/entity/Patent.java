package com.suixingpay.patent.entity;
import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.util.Date;

/**
 * yufeng
 * 2019/11/18
 * patent_manager
 **/
@Data
public class Patent {
    /** 专利表主键 **/
    private Long patentId;
    /** 专利名称 **/
    private String patentName;
    /** 专利号 **/
    private String patentNumber;
    /** 批次 **/
    private String patentBatch;
    /** 专利申请号 **/
    private String patentRequestNumber;
    /** 申请日期 **/
    private Date patentDate;
    /** 技术负责人 **/
    private Integer userIdTechnology;
    /** 专利新建人 **/
    private Integer userIdNew;
    /** 专利（公司）中文名称 **/
    private String patentApplicant;
    /** 专利类型 **/
    private Integer patentType;
    /** 法律状态 **/
    private Integer patentLawState;
    /** 专利备注 **/
    private String patentComment;

}
