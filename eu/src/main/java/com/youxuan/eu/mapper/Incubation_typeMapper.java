package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Incubation_type;

public interface Incubation_typeMapper {
    int deleteByPrimaryKey(Integer incubationTypeId);

    int insert(Incubation_type record);

    int insertSelective(Incubation_type record);

    Incubation_type selectByPrimaryKey(Integer incubationTypeId);

    int updateByPrimaryKeySelective(Incubation_type record);

    int updateByPrimaryKey(Incubation_type record);
}