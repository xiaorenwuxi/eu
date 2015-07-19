package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Incubation;
import com.youxuan.eu.model.IncubationWithBLOBs;

public interface IncubationMapper {
    int deleteByPrimaryKey(Integer incubationId);

    int insert(IncubationWithBLOBs record);

    int insertSelective(IncubationWithBLOBs record);

    IncubationWithBLOBs selectByPrimaryKey(Integer incubationId);

    int updateByPrimaryKeySelective(IncubationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IncubationWithBLOBs record);

    int updateByPrimaryKey(Incubation record);
}