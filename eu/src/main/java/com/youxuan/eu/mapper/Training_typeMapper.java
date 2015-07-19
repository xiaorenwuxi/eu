package com.youxuan.eu.mapper;

import java.util.ArrayList;

import com.youxuan.eu.model.Training_type;

public interface Training_typeMapper {
    int deleteByPrimaryKey(Integer trainingTypeId);

    int insert(Training_type record);

    int insertSelective(Training_type record);

    Training_type selectByPrimaryKey(Integer trainingTypeId);

    int updateByPrimaryKeySelective(Training_type record);

    int updateByPrimaryKey(Training_type record);
    ArrayList<Training_type> getallslectform();
}