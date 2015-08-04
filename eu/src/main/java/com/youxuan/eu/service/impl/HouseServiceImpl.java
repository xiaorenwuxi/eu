package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.HouseMapper;
import com.youxuan.eu.model.HouseWithBLOBs;
import com.youxuan.eu.service.HouseService;

/**
 * 
 * @author zhu
 *
 */
@Service 
public class HouseServiceImpl implements HouseService{
	
	@Autowired
	
	private HouseMapper housemapper;
	
	
	public int add(HouseWithBLOBs house) {
		housemapper.insert(house);
		return house.getHouseId();
	}
	public boolean delete(int houseId) {
		housemapper.deleteByPrimaryKey(houseId);
		return true;
	}
	public HouseWithBLOBs select(HouseWithBLOBs data) {
		// TODO Auto-generated method stub
		return null;
	}
	public HouseWithBLOBs selectid(int data) {
		// TODO Auto-generated method stub
		return housemapper.selectByPrimaryKey(data);
	}
	public boolean updata(HouseWithBLOBs data) {
		housemapper.updateByPrimaryKey(data);
		return false;
	}

}
