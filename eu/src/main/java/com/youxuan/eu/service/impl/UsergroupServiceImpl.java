package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.UsergroupMapper;
import com.youxuan.eu.model.Usergroup;
import com.youxuan.eu.service.UsergroupService;
/**
 * 用户组服务实现类，用来操作DAO,间接操作数据库
 * @author 邹龙
 *
 */
@Service
public class UsergroupServiceImpl implements UsergroupService{

	@Autowired
	private UsergroupMapper usergroupMapper;
	/**
	 *添加用户组，传入一个用户组对象
	 * @param usergroup要添加的用户组对象
	 * @return 返回被插入用户组对象的主键ID
	 */
	public int add(Usergroup usergroup) {
		// TODO Auto-generated method stub
		usergroupMapper.insert(usergroup);
		return usergroup.getUsergroupId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Usergroup select(Usergroup data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Usergroup data) {
		// TODO Auto-generated method stub
		return false;
	}

}
