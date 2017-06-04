package com.springtagbasicapplication;

import org.springframework.stereotype.Controller;

@Controller
public class Student {
	
	private String firstname;
	private String lastname;
	public Student() {
		super();
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
	
	
	
	

}
