package com.andreidodu.boilerplate.service.impl;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.boilerplate.dao.DataDao;
import com.andreidodu.boilerplate.db.DataDB;
import com.andreidodu.boilerplate.dto.Data;
import com.andreidodu.boilerplate.service.DataService;

@Service
@Transactional
public class DataServiceImpl implements DataService {

	@Autowired
	private DataDao dataDao;

	@Override
	public Data findById(String id) {
		DataDB db = this.dataDao.findById(id).get();
		return (new DozerBeanMapper()).map(db, Data.class);
	}

}
