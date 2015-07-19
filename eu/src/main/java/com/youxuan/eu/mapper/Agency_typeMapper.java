package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Agency_type;

public interface Agency_typeMapper {
    int deleteByPrimaryKey(Integer agencyTypeId);

    int insert(Agency_type record);

    int insertSelective(Agency_type record);

    Agency_type selectByPrimaryKey(Integer agencyTypeId);

    int updateByPrimaryKeySelective(Agency_type record);

    int updateByPrimaryKey(Agency_type record);
}