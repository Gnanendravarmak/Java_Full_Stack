package com.grayMatter.entity;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class OrdersData {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long id; 

	 private String customerName; 

	 @OneToMany(mappedBy = "order", cascade = CascadeType.PERSIST, orphanRemoval = true) 
	 private List<OrderItem> orderItems = new ArrayList<>(); 

	 public OrdersData() {} 

	 public OrdersData(String customerName) { 
	      this.customerName = customerName; 
	 } 

	 
	 public void addOrderItem(OrderItem item) { 
	      orderItems.add(item); 
	      System.out.println("Data: "+this);
	      item.setOrder(this); 
	 }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public List<OrderItem> getOrderItems() {
			return orderItems;
		}

		public void setOrderItems(List<OrderItem> orderItems) {
			this.orderItems = orderItems;
		} 
	    
	    
	    
	    
	    

}
