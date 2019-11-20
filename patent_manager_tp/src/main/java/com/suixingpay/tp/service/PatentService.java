package com.suixingpay.tp.service;

import com.suixingpay.patent.entity.Patent;

public interface PatentService {

	void insertPatent(Patent patent);

	public Patent selectPatentAndProcessById(Integer id) throws Exception;
}
