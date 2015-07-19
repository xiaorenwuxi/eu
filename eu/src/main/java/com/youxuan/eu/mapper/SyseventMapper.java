package com.youxuan.eu.mapper;

import java.util.List;

import com.youxuan.eu.model.Sysevent;

public interface SyseventMapper {
    int deleteByPrimaryKey(Integer syseventId);

    int insert(Sysevent record);

    int insertSelective(Sysevent record);

    Sysevent selectByPrimaryKey(Integer syseventId);

    int updateByPrimaryKeySelective(Sysevent record);

    int updateByPrimaryKey(Sysevent record);
    public List<Sysevent> findAll() throws Exception;
}