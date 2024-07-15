package com.grayMatter;

import java.util.Scanner;

public class Employee {
	
	String name;
	int id;
	double sal;
	String mobile;
	String email;

	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}




	
	public void getDetails() {
		System.out.println(name+" "+id+" "+sal+" "+mobile+" "+email);
	}
	
	
}
