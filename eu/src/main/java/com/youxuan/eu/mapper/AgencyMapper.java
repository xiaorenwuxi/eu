package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Agency;
import com.youxuan.eu.model.AgencyWithBLOBs;

public interface AgencyMapper {
    int deleteByPrimaryKey(Integer agencyId);

    int insert(AgencyWithBLOBs record);

    int insertSelective(AgencyWithBLOBs record);

    AgencyWithBLOBs selectByPrimaryKey(Integer agencyId);

    int updateByPrimaryKeySelective(AgencyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AgencyWithBLOBs record);

    int updateByPrimaryKey(Agency record);
}