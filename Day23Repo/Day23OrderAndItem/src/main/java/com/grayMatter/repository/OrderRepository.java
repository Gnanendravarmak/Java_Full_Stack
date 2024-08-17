package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grayMatter.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
