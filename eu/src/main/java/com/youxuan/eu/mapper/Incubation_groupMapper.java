package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Incubation_group;
/**
 * 用来操作供求
 * @author 邹龙
 *
 */
public interface Incubation_groupMapper {
    int deleteByPrimaryKey(Integer incubationGroupId);

    int insert(Incubation_group record);

    int insertSelective(Incubation_group record);

    Incubation_group selectByPrimaryKey(Integer incubationGroupId);

    int updateByPrimaryKeySelective(Incubation_group record);

    int updateByPrimaryKey(Incubation_group record);
}