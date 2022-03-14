package com.greatlearning.service;
import java.util.*;
import com.greatlearning.model.Employee;

public class CredentialService {
	public String generatePassword()
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numeral= "0123456789";
		String special= "!@#$%&+*<>?";
		String combination =upper+lower+numeral+special;
		char[] pass= new char[8];
		Random r= new Random();
		for(int i=0;i<8;i++)
			pass[i]= combination.charAt(r.nextInt(combination.length()));
		String s= String.valueOf(pass);
		return s;
	}
	
	public String generateEmailAddress(String f, String l, String d)
	{
	return f+l+"@"+d+".abc.com";
	}
	
	public void showCredentials(Employee e, String email, String p)
	{
		System.out.println("Dear "+e.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email-------> "+email);
		System.out.println("Password------> "+p);
	}
}