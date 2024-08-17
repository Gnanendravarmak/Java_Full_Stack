package com.grayMatter.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.entity.Items;
import com.grayMatter.entity.Orders;
import com.grayMatter.repository.ItemRepository;
import com.grayMatter.repository.OrderRepository;
import com.grayMatter.service.OrderAndItemService;
import java.util.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderAndItemController {
	
	private final OrderAndItemService orderAndItemService;

    @PostMapping("/addItem")
    public Items addItem(@RequestBody Items items) {
        return orderAndItemService.addItem(items);
    }

    @PostMapping("/addOrder")
    public Orders addOrder(@RequestBody Orders orders) {
        return orderAndItemService.addOrder(orders);
    }

    @GetMapping("/getAllItems")
    public List<Items> getAllItems() {
        return orderAndItemService.getItems();
    }

    @GetMapping("/getAllOrders")
    public List<Orders> getAllOrders() {
        return orderAndItemService.getOrders();
    }

    @GetMapping("/getItem/{id}")
    public Optional<Items> getItemById(@PathVariable int id) {
        return orderAndItemService.getItemById(id);
    }

    @GetMapping("/getOrder/{id}")
    public Optional<Orders> getOrderById(@PathVariable int id) {
        return orderAndItemService.getOrderById(id);
    }

    @PutMapping("/updateItem")
    public Items updateItem(@RequestBody Items items) {
        return orderAndItemService.updateItem(items);
    }

    @PutMapping("/updateOrder")
    public Orders updateOrder(@RequestBody Orders orders) {
        return orderAndItemService.updateOrder(orders);
    }

    @DeleteMapping("/deleteItem/{id}")
    public void deleteItemById(@PathVariable int id) {
        orderAndItemService.deleteItemById(id);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public void deleteOrderById(@PathVariable int id) {
        orderAndItemService.deleteOrderById(id);
    }

}
