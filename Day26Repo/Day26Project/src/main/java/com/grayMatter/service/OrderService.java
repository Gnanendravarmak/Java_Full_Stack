package com.grayMatter.service;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.OrdersData;
import com.grayMatter.entity.OrderItem;
import com.grayMatter.repository.OrderRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	 	@Transactional
	    public void createOrderWithItems() { 

	        OrdersData order = new OrdersData("John Doe"); 
	        OrderItem item1 = new OrderItem("Laptop", 1); 
	        OrderItem item2 = new OrderItem("Smartphone", 2); 

	        order.addOrderItem(item1); 
	        order.addOrderItem(item2); 

	        orderRepository.save(order); 

	    } 

}
