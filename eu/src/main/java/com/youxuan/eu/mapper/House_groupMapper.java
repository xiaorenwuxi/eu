package com.youxuan.eu.mapper;

import com.youxuan.eu.model.House_group;

public interface House_groupMapper {
    int deleteByPrimaryKey(Integer houseGroupId);

    int insert(House_group record);

    int insertSelective(House_group record);

    House_group selectByPrimaryKey(Integer houseGroupId);

    int updateByPrimaryKeySelective(House_group record);

    int updateByPrimaryKey(House_group record);
}