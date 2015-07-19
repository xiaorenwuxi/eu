package com.youxuan.eu.service;

import java.util.List;

import com.youxuan.eu.model.Sysevent;

public interface SyseventService extends BaseService<Sysevent>{
	public List<Sysevent> findAll() throws Exception;
}
