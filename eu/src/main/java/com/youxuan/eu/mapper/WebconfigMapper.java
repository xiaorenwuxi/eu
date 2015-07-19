package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Webconfig;
/**
 * 这是一个数据接口，直接用来对数据库中表的操作
 * @author 邹龙
 *
 */
public interface WebconfigMapper {
	/**
	 * 根据主键删除
	 * @param webconfigId传入一个主键ID
	 * @return
	 */
    int deleteByPrimaryKey(Integer webconfigId);

    int insert(Webconfig record);

    int insertSelective(Webconfig record);

    Webconfig selectByPrimaryKey(Integer webconfigId);

    int updateByPrimaryKeySelective(Webconfig record);

    int updateByPrimaryKeyWithBLOBs(Webconfig record);

    int updateByPrimaryKey(Webconfig record);
}