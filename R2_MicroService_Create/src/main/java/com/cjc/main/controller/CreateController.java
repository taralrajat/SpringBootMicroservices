package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.CreateServicei;


// server --> 9001

@RestController
public class CreateController {
	
	@Autowired
	CreateServicei ci;
	
	@PostMapping("/saveData")
	public String register(@RequestBody Employee e) 
	{
		ci.saveData(e);
		return "register successfull";
	}

}
