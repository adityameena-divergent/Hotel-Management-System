package com.divergentsl.hms.hms;


import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.hms.service.CRUDEmployeeService;

@Component
public class CRUDEmployee {

	private static Logger logger = LoggerFactory.getLogger(HMSMainMenu.class);
	
	@Autowired
	private CRUDEmployeeService service;
	
	public void crudEmployeeMenu() {
		
		E:
		while(true) {
			
			System.out.println("\n--------------------Edit Employee--------------------");
			
			System.out.println("\n1. Add New Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. List All Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Update Employee");
			System.out.println("6. Exit");
			
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			
			switch (input) {
			case "1":
				this.add();
				break;

			case "6":
				break E;
				
			default:
				logger.info("Invalid Input!");
				break;
			}
		}
	}
	
	
	
	public void add() {
		
		System.out.println("\n--------------------Add New Employee--------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Employee Id : ");
		int employeeId = Integer.parseInt(sc.nextLine());
		
		System.out.print("\nEnter Employee Name : ");
		String employeeName = sc.nextLine();
		
		System.out.print("\nEnter Employee Login Id : ");
		String loginId = sc.nextLine();
		
		System.out.print("\nEnter Password : ");
		String password = sc.nextLine();
		
		System.out.print("\nEnter Employee Type : ");
		String employeeType = sc.nextLine();
		
		System.out.print("\nEnter Employee Status : ");
		String status = sc.nextLine();
		
		this.service.add(employeeId, employeeName, loginId, password, employeeType, status);
		
	}
	
	
}
