package com.grayMatter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.grayMatter.customer.Customer;
import com.grayMatter.item.Item;
import com.grayMatter.order.Order;

@Configuration
public class OrderConnection {
	
	
	@Bean(name="cus")
	public Customer customer() {
		return new Customer("varma",22,"8765432","varmak@gmail.com",order());
	}
	
	
	@Bean
	public Order order() {
		return new Order(1,new Date(1,2,3),itemList());
	}
	
	@Bean
	public List<Item> itemList() {
        Item item1 = new Item(1, "biryani", 22);
        Item item2 = new Item(2, "fish", 44);
        return   Arrays.asList(item1, item2);
    }

}
