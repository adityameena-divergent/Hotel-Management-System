package com.divergentsl.hms.hms;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.hms.service.AdminService;


@Component
public class HMSMainMenu {

	private static Logger logger = LoggerFactory.getLogger(HMSMainMenu.class);
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CRUDEmployee employee;
	
	public void mainMenu() {

		while (true) {
			System.out.println("\n--------------------Hotel Management System--------------------");
			System.out.println("\n1. Admin Login");
			System.out.println("\n2. Employee Login");
			System.out.println("\n3. Exit");
			System.out.println("\n---------------------------------------------------------------");
		
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			
			switch (input) {
			case "1":
				this.adminLogin();
				break;

			case "3":
				System.exit(0);
				break;
				
			default:
				logger.info("Invalid Input!");
				break;
			}
		}
	}
	
	
	public void adminLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--------------------Admin Login--------------------");
		
		System.out.print("\nEnter Username : ");
		String username = sc.nextLine();
		
		System.out.print("\nEnter Password : ");
		String password = sc.nextLine();
		
		if (adminService.login(username, password)) {
			logger.info("Login Successful...");
			employee.crudEmployeeMenu();
		} else {
			logger.info("Incorrect Username & Password");
		}
	}
	

}
