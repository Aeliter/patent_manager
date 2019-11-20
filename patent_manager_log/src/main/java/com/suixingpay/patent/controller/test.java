package com.suixingpay.patent.controller;

import com.suixingpay.patent.log.logvalue.LogValue;
import com.suixingpay.patent.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class test {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public void showData(HttpServletRequest request, String name) {
        testService.test(request, name);
    }

}
