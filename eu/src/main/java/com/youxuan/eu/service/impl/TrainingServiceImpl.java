package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.TrainingMapper;
import com.youxuan.eu.model.Training;
import com.youxuan.eu.service.TrainingService;
/**
 * 培训服务实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class TrainingServiceImpl implements TrainingService{
	@Autowired
	private TrainingMapper trainingMapper;
	/**
	 *添加一个培训对象
	 * @param training要添加的网页配置
	 * @return 返回被插入培训对象的主键ID
	 */
	public int add(Training training) {
		trainingMapper.insert(training);
		return training.getTrainingId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Training select(Training data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Training data) {
		// TODO Auto-generated method stub
		return false;
	}

}
