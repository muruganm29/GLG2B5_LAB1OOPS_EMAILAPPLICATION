package com.greatlearning.javafsd.emailapp;

public class Employee {
    private String firstname;
    private String lastname;
    private String department;
    
    private String emailAddress;
    private String password;
    
	public Employee(String firstname, String lastname, String department) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setEmailAddress(String emailAddress) {
		
		
	}
    
}
