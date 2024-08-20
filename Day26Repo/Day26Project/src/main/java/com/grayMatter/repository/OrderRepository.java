package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.OrdersData;

@Repository
public interface OrderRepository extends JpaRepository<OrdersData, Long>{

}
