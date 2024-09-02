package com.grayMatter.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.entity.Product;
import com.grayMatter.repository.ProductsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductDaoImpl {
	
	private final ProductsRepository productsRepository;

	public Product addProduct(Product product) {
		return productsRepository.save(product);
	}

	public Optional<Product> findById(Long id) {
		return productsRepository.findById(id);
	}

	public List<Product> getAllProduct() {
		return productsRepository.findAll();
	}

	public void deleteProduct(Product product) {
		productsRepository.delete(product);
		
	}

	public Product findByProductName(String name) {
		return productsRepository.findByProductCategory(name);
	}

	public List<Product> findByPrice(String start, String end) {
		return productsRepository.findByProductPriceBetween(start, end);
	}


	
	

}
