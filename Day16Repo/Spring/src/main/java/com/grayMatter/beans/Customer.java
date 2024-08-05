package com.grayMatter.beans;

public class Customer {
	
	private String name;
	private String id;
	private String mobile;
	private Order order;
	
	public Customer(String name, String id, String mobile, Order order) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.order = order;
	}
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", mobile=" + mobile + ", order=" + order + "]";
	}
	
	

}
