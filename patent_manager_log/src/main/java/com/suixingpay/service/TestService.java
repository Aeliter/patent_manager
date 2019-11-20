package com.suixingpay.service;

import com.suixingpay.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface TestService {

    public void test(HttpServletRequest request, User user, String name);
}
