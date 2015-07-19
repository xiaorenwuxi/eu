package com.youxuan.eu.mapper;

import com.youxuan.eu.model.House_type;

public interface House_typeMapper {
    int deleteByPrimaryKey(Integer houseTypeId);

    int insert(House_type record);

    int insertSelective(House_type record);

    House_type selectByPrimaryKey(Integer houseTypeId);

    int updateByPrimaryKeySelective(House_type record);

    int updateByPrimaryKey(House_type record);
}