package com.youxuan.eu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.Equipment;
import com.youxuan.eu.service.EquipmentService;

/**
 * 
 * @author 朱贵杰
 *
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentservice;
	
	@RequestMapping("add")
	
	public void add(HttpServletRequest request, HttpServletResponse response, Equipment equipment)throws Exception{
		
		equipmentservice.add(equipment);
		response.sendRedirect("/eu/view/jsp/myfabu.jsp");
		
	}
	
}
