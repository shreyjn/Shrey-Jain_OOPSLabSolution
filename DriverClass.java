package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;


public class DriverClass {
	public static void main(String args[])
	{
		Employee emp =new Employee("Harshit", "Choudhary");
		CredentialService cs= new CredentialService();
		String genEmail, genPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc= new Scanner(System.in);
		int option =sc.nextInt();
		sc.close();
		
		switch(option)
		{
		case 1:
		{
			genEmail= cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			genPassword= cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
		}
		case 2:
		{
			genEmail= cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			genPassword= cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
		}
		case 3:
		{
			genEmail= cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "HR");
			genPassword= cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
		}
		case 4:
		{
			genEmail= cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			genPassword= cs.generatePassword();
			cs.showCredentials(emp, genEmail, genPassword);
			break;
		}
		default:
			System.out.println("Enter a valid option");
		}	
		
	}	
	}
