package com.salama.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
@Data
@Service
public class department_service {
     @Autowired
     department_repository dr;
     
     public List<department_model> findall()
     
     {
    	 
    	 return dr.findAll();
     }
     
     
     public department_model finddepartmentbyid(int id)
     {	    	 log.info("Inside find Department of DepartmentService");

    	 return dr.findById(id);
     }
     
     
     public department_model  save_department(department_model dm)
     { 
    	 log.info("Inside saveDepartment of DepartmentService");
    	return  dr.save(dm);
     }
}
