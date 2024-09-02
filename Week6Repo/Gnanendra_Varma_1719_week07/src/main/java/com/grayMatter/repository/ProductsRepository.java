package com.grayMatter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>{
	
	Product findByProductName(String name);

	Product findByProductCategory(String name);

	Product findByProductTags(String name);

	Product findByProductTagsContains(String name);

	List<Product> findByProductPriceBetween(String start, String end);

}
