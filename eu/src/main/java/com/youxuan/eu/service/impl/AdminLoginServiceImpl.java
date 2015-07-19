package com.youxuan.eu.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.AdminMapper;
import com.youxuan.eu.model.Admin;
import com.youxuan.eu.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	
	@Autowired
	private AdminMapper adminMapper;
	
	@SuppressWarnings("static-access")
	public Admin login(Admin ad) throws Exception{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(adminMapper.KEY_PO, ad);
		return adminMapper.login(params);
	}
	
}
   