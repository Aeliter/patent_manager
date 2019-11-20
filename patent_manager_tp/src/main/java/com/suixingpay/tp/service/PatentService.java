package com.suixingpay.tp.service;

import com.suixingpay.patent.entity.Patent;

import java.util.List;

public interface PatentService {

    void insertPatent(Patent patent);

    List<Patent> selectPatentAndProcessById(Integer id);

}
