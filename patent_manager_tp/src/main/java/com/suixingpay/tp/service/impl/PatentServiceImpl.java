package com.suixingpay.tp.service.impl;


import com.suixingpay.patent.entity.Patent;
import com.suixingpay.tp.mapper.PatentMapper;
import com.suixingpay.tp.service.ExecuteFlowService;
import com.suixingpay.tp.service.PatentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Description com.suixingpay.tp.service.impl
 * @Author William_Superior
 * @Date 2019/11/19 14:38
 */
@Slf4j
@Service
public class PatentServiceImpl implements PatentService {

	private static final int NEW_STATUS = 1;

	@Autowired
	private PatentMapper patentMapper;

	@Autowired
	private ExecuteFlowService flowService;

	/**
	 * 提交专利
	 * @param patent
	 */
	@Transactional
	@Override
	public boolean submitPatent(Long id) {
		boolean bool = false;
		try{
			Patent patent = new Patent();
			patent.setPatentId(id);
			bool = flowService.executeFlow(patent, NEW_STATUS);
		}catch (Exception e){
			return false;
		}
		return bool;
	}

	/**
	 * 保存专利[只保存，并不提交]
	 * @param patent
	 * @return
	 */
	@Override
	public boolean insertPatent(Patent patent) {
		return patentMapper.insertPatent(patent);
	}

	@Override
	public boolean test(long patentId, int status) {
		Patent patent = new Patent();
		patent.setPatentId(patentId);
		return flowService.executeFlow(patent, status);
	}
}
