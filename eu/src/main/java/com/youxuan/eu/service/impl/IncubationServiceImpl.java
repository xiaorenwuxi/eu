package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.IncubationMapper;
import com.youxuan.eu.model.IncubationWithBLOBs;
import com.youxuan.eu.service.IncubationService;
/**
 * 这是孵化接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class IncubationServiceImpl implements IncubationService {

	@Autowired
	private IncubationMapper incubationMapper;
	/**
	 * 这是用来添加一个孵化类的
	 * @param incubationWithBLOBs这个类是Incubation的子类
	 * @return 返回一个插入对象的主键ID
	 */
	public int add(IncubationWithBLOBs incubationWithBLOBs) {
		incubationMapper.insert(incubationWithBLOBs);
		return incubationWithBLOBs.getIncubationId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public IncubationWithBLOBs select(IncubationWithBLOBs data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(IncubationWithBLOBs data) {
		// TODO Auto-generated method stub
		return false;
	}

}
