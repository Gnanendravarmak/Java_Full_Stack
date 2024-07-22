package com.grayMatter.orders;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OrdersClass {

	public static void main(String[] args) {
		
		
		Order order = new Order(1,new Date(0, 0, 0));
		
		order.addItems(new Item(5, 100, "Samsung Galaxy S23", "Samsung"));
        order.addItems(new Item(3, 200, "iPhone 14", "Apple"));
		order.addItems(new Item(6, 300, "OnePlus 11", "OnePlus"));
        order.addItems(new Item(10, 1150, "Xiaomi Mi 13", "Xiaomi"));
        order.addItems(new Item(2, 250, "Google Pixel 8", "Google"));
		
		
		int totalCost = order.getTotalCost();
		System.out.println("Total Order Cost: " + totalCost);
		System.out.println("Oder Data: "+order.getOrderDate());
		
        Item maxPricedItem = order.getMaxPricedItem();
        if (maxPricedItem != null) {
            System.out.println("Item with the Maximum Price:");
            System.out.println("Item NOU: " + maxPricedItem.getNou());
            System.out.println("Item Price: " + maxPricedItem.getPrice());
            System.out.println("Item Name: " + maxPricedItem.getItemName());
            System.out.println("Item Brand: " + maxPricedItem.getBrand());
        } else {
            System.out.println("No items in the order.");
        }
		
		

	}

}
