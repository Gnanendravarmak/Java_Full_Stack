package com.grayMatter;

import java.util.Date;

public class Persion {
	
	private String name;
	private int id;
	private String mobile;
	private String email;
	private Date dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Persion(String name, int id, String mobile, String email, Date dob) {
		super();
		System.out.println("From person with data");
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
	}
	public Persion() {		
		System.out.println("From person");
	}
	
	

}
