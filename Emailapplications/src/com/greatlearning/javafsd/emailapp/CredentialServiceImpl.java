package com.greatlearning.javafsd.emailapp;

public class CredentialServiceImpl 
implements ICredentialService {

	public String generatePassword() {
		
	PasswordGenerator generator=new PasswordGenerator();
	String password= generator.generate();
		
		return null;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		String fristName=employee.getFirstname();
		String lastName=employee.getLastname();
		String department=employee.getDepartment();
		StringBuilder emailBuilder=new StringBuilder();
		emailBuilder.append(fristName);
		emailBuilder.append(".");
		emailBuilder.append(lastName);
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");
		String emailAddress=emailBuilder.toString();
	    employee.setEmailAddress(emailAddress);
		
		
		
		// TODO Auto-generated method stub
		return emailAddress;
	}

	public void displayCredntial(Employee employee) {
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", your generated credentials are as follows");

		// \r\n \n
		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email        --->  ");
		messageBuilder.append(employee.getEmailAddress());

		messageBuilder.append(newline);
		messageBuilder.append("Password ---> ");
		messageBuilder.append(employee.getPassword());

		String finalMessage = messageBuilder.toString();

		System.out.println(finalMessage);
	}
}