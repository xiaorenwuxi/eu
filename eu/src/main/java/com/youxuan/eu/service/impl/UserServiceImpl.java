package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.UserMapper;
import com.youxuan.eu.model.User;
import com.youxuan.eu.service.UserService;

/**
 * 是用户服务实现类，用来操作DAO,间接操作数据库
 * 
 * @author 邹龙
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 *获取一个用户（user）
	 * @param user 要获取用户的必要值，比如姓名，邮箱，全部被封装到User中
	 * @return 返回要获取到的用户
	 */
	public User select(User user) {
		return userMapper.selectallcol(user);
	}
	/**
	 *添加用户，传入一个用户（user）
	 * @param user要添加的用户
	 * @return 返回被插入用户的主键ID
	 */
	public int add(User user) {
		userMapper.insert(user);
		return user.getUserId();
	}
	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updata(User data) {
		// TODO Auto-generated method stub
		return false;
	}
}
