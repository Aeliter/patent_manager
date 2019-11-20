package com.suixingpay.patent.service;

import com.suixingpay.patent.log.logvalue.LogValue;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

@Service
public class TestServiceImpl implements TestService{

    @Override
    @Transactional
    @LogValue()
    public void test(HttpServletRequest request, String name) {

    }
}
