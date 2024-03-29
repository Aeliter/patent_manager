package com.suixingpay.service;

import com.suixingpay.log.logvalue.LogValue;
import com.suixingpay.log.logvalue.OPERATIONTYPE;
import com.suixingpay.patent.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

@Service
public class TestServiceImpl implements TestService{

    @Override
    @Transactional
    @LogValue(TYPE = OPERATIONTYPE.UPDATA, value = 1)
    public void test(HttpServletRequest request, User user, String name) {

    }
}
