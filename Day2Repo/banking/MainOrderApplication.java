package com.grayMatter.banking;

public class MainOrderApplication {
    public static void main(String[] args) {
      
        Item item1 = new Item("Laptop", 1200.0);
        Item item2 = new Item("Mouse", 25.0);
        Item item3 = new Item("Keyboard", 80.0);

        
        Order order = new Order(1001);

      
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }

        
        System.out.println("Total: $" + order.calculateTotal());
    }
}

