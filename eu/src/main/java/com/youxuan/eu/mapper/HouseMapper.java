package com.youxuan.eu.mapper;

import com.youxuan.eu.model.House;
import com.youxuan.eu.model.HouseWithBLOBs;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer houseId);

    int insert(HouseWithBLOBs record);

    int insertSelective(HouseWithBLOBs record);

    HouseWithBLOBs selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(HouseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HouseWithBLOBs record);

    int updateByPrimaryKey(House record);
}