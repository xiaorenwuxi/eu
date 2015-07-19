package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.Partner_typeMapper;
import com.youxuan.eu.model.Partner_type;
import com.youxuan.eu.service.Partner_typeService;
/**
 * 合伙人信息接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class Partner_typeServiceImpl implements Partner_typeService{

	@Autowired
	private Partner_typeMapper partner_typeMapper;
	/**
	 * 这是一个添加方法，用来添加合伙人信息
	 * @param partner_type传入要添加的合伙人信息
	 * @return 返回插入对象的主键ID
	 */
	public int add(Partner_type partner_type) {
		partner_typeMapper.insert(partner_type);
		return partner_type.getPartnertypeId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Partner_type select(Partner_type data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Partner_type data) {
		// TODO Auto-generated method stub
		return false;
	}

}
