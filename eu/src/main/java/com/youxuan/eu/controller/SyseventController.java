//package com.youxuan.eu.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.youxuan.eu.model.Sysevent;
//import com.youxuan.eu.service.SyseventService;
//
//
//@Controller
//@RequestMapping("/youxuan")
//public class SyseventController {
//	
//	@Autowired
//	private SyseventService syseventService;
//	
//	@RequestMapping("/index.do")
//	public  String findall(Model model){
//		List<Sysevent> list = null;
//		try {
//			list = syseventService.findAll();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		model.addAttribute("emps", list);
//		return "/jsp/index";
//	}
//	
//}
