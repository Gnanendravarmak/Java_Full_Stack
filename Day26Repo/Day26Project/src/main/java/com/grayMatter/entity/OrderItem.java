package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long id; 


	 private String productName; 
	 private int quantity; 

	
	 @ManyToOne(fetch = FetchType.LAZY) 
	 @JoinColumn(name = "order_id") 
	 private OrdersData order; 



	 

	    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public OrdersData getOrder() {
		return order;
	}



	public void setOrder(OrdersData order) {
		this.order = order;
	}



		public OrderItem() {} 

	 

	    public OrderItem(String productName, int quantity) { 

	        this.productName = productName; 

	        this.quantity = quantity; 

	    } 

}
