package com.youxuan.eu.mapper;

import com.youxuan.eu.model.Message;
import com.youxuan.eu.model.MessageWithBLOBs;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(MessageWithBLOBs record);

    int insertSelective(MessageWithBLOBs record);

    MessageWithBLOBs selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(MessageWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MessageWithBLOBs record);

    int updateByPrimaryKey(Message record);
}