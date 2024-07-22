package com.grayMatter.orders;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderId;
	private Date orderDate;
	private List<Item> item;
	
	
	public Order(int orderId, Date orderDate) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.item = new ArrayList<Item>();
	}
	
	public Order() {
		super();
	}
	
	public void addItems(Item item) {
		this.item.add(item);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<Item> getList() {
		return item;
	}

	public void setList(List<Item> list) {
		this.item = list;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", list=" + item + "]";
	}
	
	
	
	public int getTotalCost() {
		
		int total =0;
		
		for(Item it: item) {
			total += it.getPrice();
		}
		return total;
	}
	
	public Item getMaxPricedItem() {
		
		if (item.isEmpty()) {
            return null; // No items in the order
        }

        Item maxItem = item.get(0);
        for (Item item : item) {
            if (item.getPrice() > maxItem.getPrice()) {
                maxItem = item;
            }
        }
        return maxItem;
	}
	
	

}
