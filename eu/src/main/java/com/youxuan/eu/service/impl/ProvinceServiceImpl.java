package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.ProvinceMapper;
import com.youxuan.eu.model.Province;
import com.youxuan.eu.service.ProvinceService;

/**
 * 省服务类实现接口，对省对象的操作，用来操作DAO,间接操作数据库
 * 
 * @author 邹龙
 *
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	private ProvinceMapper provinceMapper;

	/**
	 * 添加一个省类对象 
	 * @param province 传入要添加的省对象
	 * 
	 * @return 返回被插入省对象的主键ID
	 */
	public int add(Province province) {
		provinceMapper.insert(province);
		return province.getProvinceId();
	}

	public boolean delete(int data) {
	if(provinceMapper.deleteByPrimaryKey(data)>0) 
		return true;
	else
		return false;
	}

	public Province select(Province data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Province data) {
		// TODO Auto-generated method stub
		return false;
	}

}
