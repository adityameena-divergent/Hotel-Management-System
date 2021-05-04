package com.divergentsl.hms.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "expense")
@Getter
@Setter
public class Expense {

	@Id
	@Column(name = "expense_id")
	private int expenseId;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "expense_type")
	private String expenseType;
	
	@Column(name = "expense_description")
	private String expenseDescription;
	
	@Column(name = "expense_amount")
	private double expenseAmount;
	
	@Column(name = "expense_date")
	private LocalDate expenseDate;
	
	@Column(name = "status")
	private String status;
	
}
