package com.youxuan.eu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.service.Training_typeService;

/**
 * 培训类型控制类，调用service层操作数据库
 * 
 * @author 邹龙
 *
 */
@Controller
@RequestMapping("/training_typeController")
public class Training_typeController {
	@Autowired
	private Training_typeService training_typeService;
	
	@RequestMapping("getallform")
	private String getallform(Model model){
		System.out.println("开始获取");
	     model.addAttribute("alltraining_types", training_typeService.getallslectform());
		return "/jsp/Training";
	}
	
}
