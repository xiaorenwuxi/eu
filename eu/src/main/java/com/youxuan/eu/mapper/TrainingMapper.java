package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Training;

public interface TrainingMapper {
    int deleteByPrimaryKey(Integer trainingId);

    int insert(Training record);

    int insertSelective(Training record);

    Training selectByPrimaryKey(Integer trainingId);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKeyWithBLOBs(Training record);

    int updateByPrimaryKey(Training record);
}