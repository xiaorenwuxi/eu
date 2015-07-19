package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.WebconfigMapper;
import com.youxuan.eu.model.Webconfig;
import com.youxuan.eu.service.BaseService;
import com.youxuan.eu.service.WebconfigService;
/**
 * 网页配置实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class WebconfigServiceImpl implements WebconfigService,BaseService<Webconfig> {

	@Autowired
	private WebconfigMapper webconfigMapper;
	/**
	 *添加用户，传入一个网页配置（webconfig）
	 * @param webconfig要添加的网页配置
	 * @return 返回被插入网页配置的主键ID
	 */
	public int add(Webconfig webconfig) {
		// TODO Auto-generated method stub
		webconfigMapper.insert(webconfig);
		return webconfig.getWebconfigId();
	}
	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}
	public Webconfig select(Webconfig data) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updata(Webconfig data) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
