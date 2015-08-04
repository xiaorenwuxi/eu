package com.youxuan.eu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.AgencyWithBLOBs;
import com.youxuan.eu.service.AgencyService;

/**
 * 
 * @author 朱贵杰
 *
 */
@Controller
@RequestMapping("/agency")
public class AgencyController {

	@Autowired
	private AgencyService agencyservice;
	
	@RequestMapping("add")
	public void add(HttpServletRequest request, HttpServletResponse response,AgencyWithBLOBs agency)throws Exception{
		
		agencyservice.add(agency);
		
		response.sendRedirect("/eu/view/jsp/myfabu.jsp");
	
		
	}
}
