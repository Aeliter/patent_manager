package com.suixingpay.controller;

import com.suixingpay.patent.entity.User;
import com.suixingpay.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/test")
public class test {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public void showData(HttpServletRequest request, String name) {
        HttpSession session = request.getSession();
        User user = new User();
        user.setUserId((long) 1);
        user.setUserDepartment(24);
        user.setUserEmail("dsfdsf");
        user.setUserName("dsaf");
        user.setUserPassword("5451");
        user.setUserPhone("45451");
        session.setAttribute("user", user);
        testService.test(request, user, name);
    }

}
