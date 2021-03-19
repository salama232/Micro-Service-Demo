package com.salama.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
@Service
public class user_service {
     @Autowired
     user_repository ur;
     @Autowired
     RestTemplate restTemplate;
     
     
     public List<user_model> findall()
     
     {
    	 
    	 return ur.findAll();
     }
     
     
     public response_tamplate finduserbyid(int id)
     
     {   response_tamplate rt=new response_tamplate();
 	log.info("Inside get user of DepartmentService");
    	 rt.setUser(ur.findById(id));
    	 department_model dm=
    			 restTemplate.getForObject("http://DEPARTMENT-SERVICE:9091/departments/"+ur.findById(id).getDepartmentId()
    					 ,department_model.class);
    	 rt.setDepartment(dm);
    	 return rt;
    	 
     }
     
     
     public user_model  save_user(user_model um)
     { 
    	log.info("Inside save user of DepartmentService");
    	return  ur.save(um);
     }
}
