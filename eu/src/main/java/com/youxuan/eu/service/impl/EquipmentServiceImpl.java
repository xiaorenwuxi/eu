package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.EquipmentMapper;
import com.youxuan.eu.model.Equipment;
import com.youxuan.eu.service.EquipmentService;

/**
 * 
 * @author 朱贵杰
 *
 */
@Service
public class EquipmentServiceImpl implements EquipmentService{
	
	@Autowired
	private EquipmentMapper equipmentmapper;
	
	public int add(Equipment equipment) {
		equipmentmapper.insert(equipment);
		return equipment.getEquipmentId();
	}
	public boolean delete(int data) {
		return false;
	}
	public Equipment selectid(int equipmentId) {
		
		return equipmentmapper.selectByPrimaryKey(equipmentId);
	}
	public boolean updata(Equipment agency) {
		
		return false;
	}
	public Equipment select(Equipment equipment) {
		
		return null;
	}
	
}
