package com.salama.department.service;

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
@Entity(name = "department")
public class department_model {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	 private String departmentName;
	 private String departmentAddress;
	 private String departmentCode;
	

}
