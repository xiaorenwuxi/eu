package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.StartupinfoMapper;
import com.youxuan.eu.model.Startupinfo;
import com.youxuan.eu.service.StartupinfoService;
/**
 * 创业信息服务接口实现类，用来操作DAO,间接操作数据库
 * @author 邹龙 & 朱贵杰
 *
 */
@Service
public class StartupinfoServiceImpl implements StartupinfoService {

	@Autowired
	private StartupinfoMapper startupinfoMapper;
	/**
	 *添加一个创业信息对象
	 * @param startupinfoWithBLOBs是startupinfo的子类，
	 * 要添加的创业信息对象
	 * @return 返回被插入创业信息对象的主键ID
	 */
	public int add(Startupinfo startupinfo) {
		startupinfoMapper.insert(startupinfo);
		return startupinfo.getStartupinfoId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public Startupinfo select(Startupinfo data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(Startupinfo data) {
		// TODO Auto-generated method stub
		return false;
	}

}
