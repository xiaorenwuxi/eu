package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.InfoMapper;
import com.youxuan.eu.model.Info;
import com.youxuan.eu.service.InfoService;
/**
 * 表单信息接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoMapper infoMapper;
	/**
	 * 这是一个添加方法，用来添加一个表单信息
	 * @param info是一个表单对象
	 * @return 返回添加后该对象的主键ID
	 */
	public int add(Info info) {
		infoMapper.insert(info);
		return info.getInfoId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Info select(Info data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Info data) {
		// TODO Auto-generated method stub
		return false;
	}

}
