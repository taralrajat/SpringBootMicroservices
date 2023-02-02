package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.GetServicei;

// server --> 9002

@RestController
public class getController {
	
	@Autowired
	GetServicei gs;
	
	@GetMapping("/getData")
	public List<Employee> login() 
	{


			List<Employee> list = gs.getAllData();

			return list;

	}

}
