package com.suixingpay.tp.controller;

import com.suixingpay.patent.entity.Patent;
import com.suixingpay.tp.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: com.suixingpay.tp.controller
 * @author: William_Superior
 * @date: 2019/11/19 14:36
 */

@RestController
@RequestMapping("/patent")
public class PatentController {
    @Autowired
    private PatentService patentService;

    /**
     * 新建专利
     * @param patent 专利对象
     * @return
     */
    @PostMapping("/insert")
    public String insertPatent(Patent patent) {
        patentService.insertPatent(patent);
        return "forward:/";  // 调到查询所有专利
    }

    @GetMapping("/select")
    public List<Patent> selectPatentAndProcessById(Integer id) {
        List<Patent> list = patentService.selectPatentAndProcessById(id);
        return list;
    }

}
