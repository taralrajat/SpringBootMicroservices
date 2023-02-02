package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Employee;
import com.cjc.main.service.DeleteServicei;

@RestController
public class deleteController {
	
	@Autowired
	DeleteServicei ds;
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) 
	{
		ds.deleteData(id);

		return "success";
	}

}
