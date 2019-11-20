package com.suixingpay.tp.service;

import com.suixingpay.patent.entity.Patent;

public interface ExecuteFlowService {

    /**
     * 流程执行
     * @param patent 专利
     * @param status 状态（存在分叉的部分，存在1和0状态，默认是0）
     * @return
     */
    boolean executeFlow(Patent patent, int status);

}
