package com.suixingpay.tp.service.impl;


import com.suixingpay.patent.entity.Patent;
import com.suixingpay.tp.mapper.PatentMapper;
import com.suixingpay.tp.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description com.suixingpay.tp.service.impl
 * @Author William_Superior
 * @Date 2019/11/19 14:38
 */

@Service
public class PatentServiceImpl implements PatentService {
	@Autowired
	private PatentMapper patentRepository;

	@Override
	public void insertPatent(Patent patent) {
		patentRepository.insertPatent(patent);
	}
}
