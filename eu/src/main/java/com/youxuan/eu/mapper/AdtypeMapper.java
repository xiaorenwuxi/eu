package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Adtype;

public interface AdtypeMapper {
    int deleteByPrimaryKey(Integer adtypeId);

    int insert(Adtype record);

    int insertSelective(Adtype record);

    Adtype selectByPrimaryKey(Integer adtypeId);

    int updateByPrimaryKeySelective(Adtype record);

    int updateByPrimaryKey(Adtype record);
}