package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.Incubation_groupMapper;
import com.youxuan.eu.model.Incubation_group;
import com.youxuan.eu.service.Incubation_groupService;
/**
 * 供求接口的实现，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class Incubation_groupServiceImpl implements Incubation_groupService {
	
	@Autowired
	private Incubation_groupMapper incubation_groupMapper;
/**
 * 添加一个供求
 * @param incubation_group传入要插入的对象
 * @return 返回插入后，对象的主键ID
 */
	public int add(Incubation_group incubation_group) {
		incubation_groupMapper.insert(incubation_group);
		return incubation_group.getIncubationGroupId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Incubation_group select(Incubation_group data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Incubation_group data) {
		// TODO Auto-generated method stub
		return false;
	}

}
