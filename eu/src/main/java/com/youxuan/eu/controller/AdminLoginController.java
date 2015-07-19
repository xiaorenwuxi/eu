package com.youxuan.eu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.Admin;
import com.youxuan.eu.service.AdminLoginService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@RequestMapping("login")
	public String login(Admin admin ,Model model){
		Admin us =null;
		try {
			 us = adminLoginService.login(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (us!=null) {
			if (us.getUsername().equals(admin.getUsername())&&us.getPassword().equals(admin.getPassword())) {
			}
			model.addAttribute("jg", "登陆成功");
			return "/jsp/index";
		}else {
			model.addAttribute("jg", "登陆失败");
			return "/jsp/index";
		}
	}
}
