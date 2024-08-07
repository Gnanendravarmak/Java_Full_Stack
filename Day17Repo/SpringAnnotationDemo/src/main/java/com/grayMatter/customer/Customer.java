package com.grayMatter.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import com.grayMatter.order.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Customer {
	
	private String name;
	private int id;
	private String mobile;
	private String email;
	
	@Autowired
	private Order orderId;

}
