package com.youxuan.eu.service;

import java.util.ArrayList;

import com.youxuan.eu.model.Training_type;
/**
 * 培训类型服务接口
 * @author 邹龙
 *
 */
public interface Training_typeService extends BaseService<Training_type>{
/**
 * 用来获取所有的培训类型
 * @return 表中所有的培训类型
 */
	public ArrayList<Training_type> getallslectform();
}
