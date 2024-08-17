package com.grayMatter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Items;
import com.grayMatter.entity.Orders;
import com.grayMatter.repository.ItemRepository;
import com.grayMatter.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderAndItemService {
	
	private final ItemRepository itemsRepository;
    private final OrderRepository ordersRepository;

    public Items addItem(Items items) {
        return itemsRepository.save(items);
    }

    public Orders addOrder(Orders orders) {
        return ordersRepository.save(orders);
    }

    public List<Items> getItems() {
        return (List<Items>) itemsRepository.findAll();
    }

    public List<Orders> getOrders() {
        return (List<Orders>) ordersRepository.findAll();
    }

    public Optional<Items> getItemById(int id) {
        return itemsRepository.findById(id);
    }

    public Optional<Orders> getOrderById(int id) {
        return ordersRepository.findById(id);
    }

    public Items updateItem(Items items) {
        return itemsRepository.save(items);
    }

    public Orders updateOrder(Orders orders) {
        return ordersRepository.save(orders);
    }

    public void deleteItemById(int id) {
        itemsRepository.deleteById(id);
    }

    public void deleteOrderById(int id) {
        ordersRepository.deleteById(id);
    }

}
