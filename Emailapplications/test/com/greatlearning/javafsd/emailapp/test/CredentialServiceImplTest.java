package com.greatlearning.javafsd.emailapp.test;


import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;
import com.greatlearning.javafsd.emailapp.PasswordGenerator;

public class CredentialServiceImplTest {
public static void main(String[] args) {
	//testEmailAddressGeneration();
	testPasswordGeneration();
	
	CredentialServiceImpl serviceImpl=new CredentialServiceImpl();
	Employee vijay=new Employee("vijay", "kumar", "technical");
	String emailAddress = serviceImpl.generateEmailAddress(vijay);
	System.out.println(emailAddress);
	
}
static void testPasswordGeneration() {

	CredentialServiceImpl serviceImpl = 
			new CredentialServiceImpl();

	String password  = serviceImpl.generatePassword();
	System.out.println("Password ->" + password);
}
}
