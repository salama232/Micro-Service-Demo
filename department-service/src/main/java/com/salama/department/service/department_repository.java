package com.salama.department.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface department_repository extends JpaRepository<department_model, Integer>{
	
	department_model  findById(int Id);
	


}
