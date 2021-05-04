package com.divergentsl.hms.hms;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminOperation {

	private static Logger logger = LoggerFactory.getLogger(AdminOperation.class);
	
	@Autowired
	private CRUDEmployee employee;
	
	public void adminMenu() {

		E:
		while (true) {

			System.out.println("\n--------------------Admin Menu--------------------");
			System.out.println("\n1. Employee");
			System.out.println("2. Room");
			System.out.println("3. Room Type");
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			
			switch (input) {
			case "1":
				this.employee.crudEmployeeMenu();
				break;

			case "4":
				break E;
				
			default:
				logger.info("Invalid Input!");
				break;
			}
		}
	}
	
	
	

}
