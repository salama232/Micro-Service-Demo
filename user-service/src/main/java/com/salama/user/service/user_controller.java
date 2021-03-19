package com.salama.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class user_controller {
	
	
	@Autowired
	user_service us;
	
	@PostMapping(value = "/add")
	public user_model savedepartment(@RequestBody user_model user_model) {
		
		return us.save_user(user_model);
	}
	
	@GetMapping(value="/all")
	public List<user_model> getalldepartment ()
	{
		return us.findall();
	}
	
	
	@GetMapping(value="/{id}")
	public response_tamplate getuser(@PathVariable("id") int userid)
	{
		return us.finduserbyid(userid);
	}
	


}
