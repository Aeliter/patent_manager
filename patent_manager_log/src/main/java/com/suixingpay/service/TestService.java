package com.suixingpay.service;

import com.suixingpay.patent.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface TestService {

    public void test(HttpServletRequest request, User user, String name);
}
