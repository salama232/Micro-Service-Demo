package com.salama.user.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class user_model {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int userId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private Long departmentId;

}
