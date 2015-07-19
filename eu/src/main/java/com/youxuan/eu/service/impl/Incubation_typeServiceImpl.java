package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.Incubation_typeMapper;
import com.youxuan.eu.model.Incubation_type;
import com.youxuan.eu.service.Incubation_typeService;
/**
 * 孵化类型接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class Incubation_typeServiceImpl implements Incubation_typeService {

	@Autowired
	private Incubation_typeMapper incubation_typeMapper;
	/**
	 * 这个方法是用来添加一个孵化类型
	 * @param data 是要添加的对象
	 * @return 返回插入对象的主键ID
	 */
	public int add(Incubation_type data) {
		incubation_typeMapper.insert(data);
		return data.getIncubationTypeId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Incubation_type select(Incubation_type data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Incubation_type data) {
		// TODO Auto-generated method stub
		return false;
	}

}
