package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Admin_group;

public interface Admin_groupMapper {
    int deleteByPrimaryKey(Integer adminGroupId);

    int insert(Admin_group record);

    int insertSelective(Admin_group record);

    Admin_group selectByPrimaryKey(Integer adminGroupId);

    int updateByPrimaryKeySelective(Admin_group record);

    int updateByPrimaryKeyWithBLOBs(Admin_group record);

    int updateByPrimaryKey(Admin_group record);
}