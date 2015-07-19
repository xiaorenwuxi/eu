package com.youxuan.eu.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.Training_typeMapper;
import com.youxuan.eu.model.Training_type;
import com.youxuan.eu.service.Training_typeService;
/**
 * 培训类型服务接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class Training_typeServiceImpl implements Training_typeService {

	@Autowired
	private Training_typeMapper training_typeMapper;
	/**
	 *添加一个培训类型对象
	 * @param training_type要添加的培训类型对象
	 * @return 返回被插入培训类型对象的主键ID
	 */
	public int add(Training_type training_type) {
		training_typeMapper.insert(training_type);
		return training_type.getTrainingTypeId();
	}

	public boolean delete(int data) {
		System.out.println("影响数据："+training_typeMapper.deleteByPrimaryKey(data));
		return false;
	}

	public Training_type select(Training_type data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Training_type data) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Training_type> getallslectform() {
		
		return training_typeMapper.getallslectform();
	}

}
