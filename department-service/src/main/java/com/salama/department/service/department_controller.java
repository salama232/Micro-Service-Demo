package com.salama.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/departments")
public class department_controller {
	
	
	@Autowired
	department_service ds;
	
	@PostMapping(value = "/add")
	public department_model savedepartment(@RequestBody department_model department_model) {
	  log.info("Inside saveDepartment method of DepartmentController");
		return ds.save_department(department_model);
	}
	
	@GetMapping(value="/all")
	public List<department_model> getalldepartment ()
	{
		return ds.findall();
	}
	
	
	@GetMapping(value="/{id}")
	public department_model getdepartment(@PathVariable int id)
	{		  log.info("Inside get Department method of DepartmentController");

		return ds.finddepartmentbyid(id);
	}
	


}
