package com.suixingpay.tp.controller;

import com.suixingpay.patent.entity.Patent;
import com.suixingpay.tp.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description com.suixingpay.tp.controller
 * @Author William_Superior
 * @Date 2019/11/19 14:36
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
	public String insertPatent( Patent patent) {
        System.out.println(patent.toString());
		patentService.insertPatent(patent);
		return "forward:/";  // 调到查询所有专利
	}

	/**
	 * 提交专利
	 * @param id
	 * @return
	 */
	@PostMapping("/submit")
	public boolean submit(Long id){
        System.out.println("id====="+id);
	    return patentService.submitPatent(id);
	}

	//TODO
    @PostMapping("/test")
    public boolean test( long patentId, int status) {
	    return patentService.test(patentId, status);
    }
}
