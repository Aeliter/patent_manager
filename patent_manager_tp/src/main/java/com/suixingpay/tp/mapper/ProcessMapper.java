package com.suixingpay.tp.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.suixingpay.patent.entity.Process;

@Mapper
public interface ProcessMapper {

    /**
     * 根据专利id获取最新节点
     * @param id
     * @return
     */
    Process getProcessById(long id);

    /**
     * 插入流程
     * @param process
     * @return
     */
    boolean insertProcess(Process process);
}
