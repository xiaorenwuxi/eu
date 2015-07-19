package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Partner_type;

public interface Partner_typeMapper {
    int deleteByPrimaryKey(Integer partnertypeId);

    int insert(Partner_type record);

    int insertSelective(Partner_type record);

    Partner_type selectByPrimaryKey(Integer partnertypeId);

    int updateByPrimaryKeySelective(Partner_type record);

    int updateByPrimaryKey(Partner_type record);
}