package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Failedlogin;

public interface FailedloginMapper {
    int deleteByPrimaryKey(Integer failedloginId);

    int insert(Failedlogin record);

    int insertSelective(Failedlogin record);

    Failedlogin selectByPrimaryKey(Integer failedloginId);

    int updateByPrimaryKeySelective(Failedlogin record);

    int updateByPrimaryKey(Failedlogin record);
}