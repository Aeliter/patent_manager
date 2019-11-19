package com.suixingpay.patent.entity;

import lombok.Data;

/**
 * @description:
 * @author: Aeliter
 * @date: 2019-11-19 10:34
 * @version: V1.0
 */
@Data
public class NodeLink {
    /** 节点关系id **/
    private Long nodeLinkId;
    /** 前节点 **/
    private Long beforeNodeLink;
    /** 尾节点 **/
    private Long afterNodeLink;
    /** 节点关系描述 **/
    private String nodeLinkComment;
    /** 节点关系状态 **/
    private Integer nodeLinkState;
}
