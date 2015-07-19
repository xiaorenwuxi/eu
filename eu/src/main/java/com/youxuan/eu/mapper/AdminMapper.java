package com.youxuan.eu.mapper;

import java.util.Map;

import com.youxuan.eu.model.Admin;

public interface AdminMapper {
	static final String KEY_PO="us";
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminId) throws Exception;

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    Admin login(Map<String, Object> map);
}