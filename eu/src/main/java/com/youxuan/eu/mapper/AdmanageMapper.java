package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Admanage;

public interface AdmanageMapper {
    int deleteByPrimaryKey(Integer admanageId);

    int insert(Admanage record);

    int insertSelective(Admanage record);

    Admanage selectByPrimaryKey(Integer admanageId);

    int updateByPrimaryKeySelective(Admanage record);

    int updateByPrimaryKeyWithBLOBs(Admanage record);

    int updateByPrimaryKey(Admanage record);
}