package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;
@Repository
public interface repositoryi extends CrudRepository<Employee, Integer>{

}
