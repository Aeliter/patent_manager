package com.suixingpay.tp.service.impl;

import com.suixingpay.patent.entity.NodeLink;
import com.suixingpay.patent.entity.Patent;
import com.suixingpay.patent.entity.Process;
import com.suixingpay.tp.mapper.NodeLinkMapper;
import com.suixingpay.tp.mapper.ProcessMapper;
import com.suixingpay.tp.service.ExecuteFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
@Slf4j
@Service
public class ExecuteFlowServiceImpl implements ExecuteFlowService {

    @Autowired
    private ProcessMapper processMapper;

    @Autowired
    private NodeLinkMapper linkMapper;
    
    @Transactional
    @Override
    public boolean executeFlow(Patent patent, int status) {
        try{
            //获取当前专利所在流程表的最新位置（根据专利id）
            Process process = processMapper.getProcessById(patent.getPatentId());
            //根据流程的状态获取到下一个节点
            NodeLink nextNode = linkMapper.getNextNode(process.getProcessState(), status);
            //更改当前专利的状态及时间（将记录插入到数据库中）
            process.setProcessTime(new Date());
            process.setProcessState(Integer.parseInt(nextNode.getAfterNodeLink().toString()));
            //插入流程
            boolean bool = processMapper.insertProcess(process);
        }catch(Exception e){
            log.error("更改状态失败！");
            return false;
        }
        return true;
    }
}
