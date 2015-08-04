package com.youxuan.eu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.HouseWithBLOBs;
import com.youxuan.eu.service.HouseService;

/**
 * 
 * @author 朱贵杰
 *
 */
@Controller
@RequestMapping("/houseinfo")
public class HouseController {
	
	@Autowired
	
	private HouseService houseservice;
	
	@RequestMapping("add")
	
	public void houseadd(HttpServletRequest request, HttpServletResponse response , HouseWithBLOBs house) throws Exception{
		
		//PrintWriter out = response.getWriter();
		
			houseservice.add(house);
			//out.print("<script language='javascript'> location.href='myfabu.jsp';</script>");
			response.sendRedirect("/eu/view/jsp/myfabu.jsp");
			//request.getRequestDispatcher("/eu/view/jsp/myfabu.jsp").forward(request, response);
		
		
		
	}
}
