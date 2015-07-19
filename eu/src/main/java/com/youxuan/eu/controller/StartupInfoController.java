package com.youxuan.eu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.Startupinfo;
import com.youxuan.eu.service.StartupinfoService;

/**
 * @date 2015/7/15
 * @author zhu
 * @version 1.0
 * @e创中心的控制层
 *
 */
@Controller
@RequestMapping("/ec")
public class StartupInfoController {
	
	@Autowired
	private StartupinfoService startupinfoService;
	
	@RequestMapping("submit")
	/*public String addec(HttpServletRequest request, @RequestParam(required=false , defaultValue="") String data){
		Startupinfo startupinfo = null;
		try {
			JSONObject jsonObject=JSON.parseObject(URLDecoder.decode(data,"UTF-8"));
			startupinfo=JSON.parseObject(jsonObject.toString(), new TypeReference<Startupinfo>(){});
			startupinfo.setTitle(jsonObject.getString("title"));
			startupinfoService.add(startupinfo);
		} catch (Exception e) {
			System.out.println("错误");
		}
		
		return "/jsp/index";
	}*/
	public String addec(Startupinfo startupinfo, HttpServletResponse response){
		PrintWriter out=null;
		try{
			out=response.getWriter();
		}catch(IOException e){
			e.printStackTrace();
		}
		if(startupinfoService.add(startupinfo)>0){
			startupinfoService.add(startupinfo);
			out.write("提交成功");
			out.flush();
			out.close();
		}
		return "/jsp/index";
		
	}
}
