package com.grayMatter.order;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grayMatter.item.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Order {
	
	
	private int orderId;
	private Date orderDate;
	@Autowired
	private List<Item> items;

}
