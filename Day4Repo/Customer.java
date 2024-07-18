package com.grayMatter;

import java.io.Serializable;

public class Customer implements Serializable {
	
	private String name;
	private int id;
	
	
	public Customer() {
		super();
	}
	
	
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


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
	
	
	
	
	

}
