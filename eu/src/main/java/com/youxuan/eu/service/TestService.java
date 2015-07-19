package com.youxuan.eu.service;

import java.util.ArrayList;

import com.youxuan.eu.model.Adtype;
import com.youxuan.eu.model.Adtype_Detailed;

public interface TestService extends BaseService<Adtype>{
	public ArrayList<Adtype_Detailed> select_detailed(int id);
}
