package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Usergroup;

public interface UsergroupMapper {
    int deleteByPrimaryKey(Integer usergroupId);

    int insert(Usergroup record);

    int insertSelective(Usergroup record);

    Usergroup selectByPrimaryKey(Integer usergroupId);

    int updateByPrimaryKeySelective(Usergroup record);

    int updateByPrimaryKey(Usergroup record);
}