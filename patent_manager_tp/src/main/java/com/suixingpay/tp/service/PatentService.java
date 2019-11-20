package com.suixingpay.tp.service;

import com.suixingpay.patent.entity.Patent;

public interface PatentService {


	boolean insertPatent(Patent patent);
	boolean submitPatent(Long id);
	boolean test(long patentId, int status);
}
