package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Startupinfo;

public interface StartupinfoMapper {
    int deleteByPrimaryKey(Integer startupinfoId);

    int insert(Startupinfo startupinfo);

    int insertSelective(Startupinfo record);

    Startupinfo selectByPrimaryKey(Integer startupinfoId);

    int updateByPrimaryKeySelective(Startupinfo record);

    int updateByPrimaryKeyWithBLOBs(Startupinfo record);

    int updateByPrimaryKey(Startupinfo record);
}