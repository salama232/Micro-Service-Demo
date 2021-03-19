package com.salama.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_repository extends JpaRepository<user_model, Integer>{
	
	user_model  findById(int Id);
	


}
