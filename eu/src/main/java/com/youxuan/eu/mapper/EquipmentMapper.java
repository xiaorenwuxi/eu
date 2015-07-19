package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Equipment;

public interface EquipmentMapper {
    int deleteByPrimaryKey(Integer equipmentId);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(Integer equipmentId);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKeyWithBLOBs(Equipment record);

    int updateByPrimaryKey(Equipment record);
}