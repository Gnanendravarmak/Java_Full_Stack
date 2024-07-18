package com.grayMatter;

import java.util.Date;

public class Customer extends Persion{
	
	private double orderSum;
	private int orderId;
	public Customer(String name, int id, String mobile, String email, Date dob, double orderSum, int orderId) {
		super(name, id, mobile, email, dob);
		this.orderSum = orderSum;
		this.orderId = orderId;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [orderSum=" + orderSum + ", orderId=" + orderId + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail() + ", getDob()=" + getDob()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
