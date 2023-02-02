package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.repository.repositoryi;
import com.cjc.main.service.DeleteServicei;


@Service
public class ServiceImpl implements DeleteServicei{

	@Autowired
	repositoryi ri;
	
	@Override
	public void deleteData(Integer id) {
		
		ri.deleteById(id);
		
	}

}
