package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.repositoryi;
import com.cjc.main.service.UpdateServicei;

@Service
public class ServiceImpl implements UpdateServicei{

	@Autowired
	repositoryi ri;
	
	@Override
	public void saveData(Employee e) {
		
		ri.save(e);
		
	}

}
