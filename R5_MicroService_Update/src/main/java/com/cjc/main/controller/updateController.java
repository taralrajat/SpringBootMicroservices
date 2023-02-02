package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.UpdateServicei;

@RestController
public class updateController {
	
	@Autowired
	UpdateServicei us;
	
	@PutMapping("/update")
	public String update(@RequestBody Employee e) 
	{
		us.saveData(e);

		return "Update successfull";
	}

}
