package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Adminstrator
 * @date: 2019-11-18 17:46
 * @version: V1.0
 */
@Data
public class File { 
    /** 文件表id **/
    private Long fileId;
    /** 外键：指向流程表 **/
    private Long processId;
    /** 文件地址 **/
    private String filePath;
    /** 文件中文名 **/
    private String fileName;
}
