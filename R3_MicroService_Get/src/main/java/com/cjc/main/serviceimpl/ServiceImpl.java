package com.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Employee;
import com.cjc.main.repository.repositoryi;
import com.cjc.main.service.GetServicei;

@Service
public class ServiceImpl implements GetServicei{
	
	@Autowired
	repositoryi ri;
	
	@Override
	public List<Employee> getAllData() {
		
		List<Employee> list = (List<Employee>) ri.findAll();
		
		return list;
	}

}
