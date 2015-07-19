package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Equipment_type;

public interface Equipment_typeMapper {
    int deleteByPrimaryKey(Integer equipmentTypeId);

    int insert(Equipment_type record);

    int insertSelective(Equipment_type record);

    Equipment_type selectByPrimaryKey(Integer equipmentTypeId);

    int updateByPrimaryKeySelective(Equipment_type record);

    int updateByPrimaryKey(Equipment_type record);
}