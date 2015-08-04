package com.youxuan.eu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youxuan.eu.mapper.AgencyMapper;
import com.youxuan.eu.model.AgencyWithBLOBs;
import com.youxuan.eu.service.AgencyService;
/**
 * 
 * @author 朱贵杰
 *
 */

@Service
public class AgencyServiceImpl implements AgencyService {
	
	@Autowired
	private AgencyMapper agencymapper;
	
	public int add(AgencyWithBLOBs agency) {
		agencymapper.insert(agency);
		return agency.getAgencyId();
	}
	public boolean delete(int data) {
		return false;
	}
	public AgencyWithBLOBs selectid(int agencyid) {
		// TODO Auto-generated method stub
		return agencymapper.selectByPrimaryKey(agencyid);
	}
	public boolean updata(AgencyWithBLOBs agency) {
		return false;
	}
	public AgencyWithBLOBs select(AgencyWithBLOBs agency) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
