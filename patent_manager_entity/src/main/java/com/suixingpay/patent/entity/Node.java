package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Aeliter
 * @date: 2019-11-19 10:32
 * @version: V1.0
 */
@Data
public class Node {
    /** 节点id **/
    private Long nodeId;
    /** 节点名称 **/
    private String nodeName;
    /** 节点描述 **/
    private String nodeComment;
}
