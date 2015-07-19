package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.MessageMapper;
import com.youxuan.eu.model.MessageWithBLOBs;
import com.youxuan.eu.service.MessageService;

/**
 * 留言接口实现类，用来操作DAO,间接操作数据库
 * 
 * @author 邹龙
 *
 */
@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageMapper messageMapper;
/**
 * 这是一个添加方法，用来向数据库中添加留言
 * @param data 传入一个留言
 * @return 返回的是插入留言的主键ID
 */
	public int add(MessageWithBLOBs data) {
		messageMapper.insert(data);
		return data.getMessageId();
	}

	public boolean delete(int data) {
		// TODO Auto-generated method stub
		return false;
	}

	public MessageWithBLOBs select(MessageWithBLOBs data) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updata(MessageWithBLOBs data) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
