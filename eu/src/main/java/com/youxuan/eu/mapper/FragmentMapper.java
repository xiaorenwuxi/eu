package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Fragment;

public interface FragmentMapper {
    int deleteByPrimaryKey(Integer fragmentId);

    int insert(Fragment record);

    int insertSelective(Fragment record);

    Fragment selectByPrimaryKey(Integer fragmentId);

    int updateByPrimaryKeySelective(Fragment record);

    int updateByPrimaryKeyWithBLOBs(Fragment record);

    int updateByPrimaryKey(Fragment record);
}