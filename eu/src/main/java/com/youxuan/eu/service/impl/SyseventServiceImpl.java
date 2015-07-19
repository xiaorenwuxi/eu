package com.youxuan.eu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.SyseventMapper;
import com.youxuan.eu.model.Sysevent;

@Service()
public class SyseventServiceImpl {
	
	@Autowired
	private  SyseventMapper syseventMapper;
	
	public List<Sysevent> findAll() throws Exception{
		return syseventMapper.findAll();
	}
	
}
