package com.divergentsl.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

	@Id
	private int employeeId;
	
	@Column(name = "empname")
	private String employeeName;
	
	@Column(name = "login_id")
	private String loginId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "employee_type")
	private String employeeType;
	
	@Column(name = "status")
	private String status;
	
}
