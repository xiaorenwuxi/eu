package com.youxuan.eu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youxuan.eu.model.Training;
import com.youxuan.eu.service.TrainingService;

@Controller
@RequestMapping("/TrainingController")
public class TrainingController {
	@Autowired
	public TrainingService trainingservice;

	@RequestMapping("addTraining")
	public void addTraining(Training training,HttpServletResponse response) {
		System.out.println("开始添加");
		System.out.println(training.getTrainingPicture());
		PrintWriter out=null;
		try {
		 out=response.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		trainingservice.add(training);
		out.write("发布成功");
		out.flush();
		out.close();
	}
}
