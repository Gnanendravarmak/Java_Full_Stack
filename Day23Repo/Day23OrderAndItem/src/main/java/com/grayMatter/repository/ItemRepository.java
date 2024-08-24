package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer>{

}