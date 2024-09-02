package com.grayMatter.service;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;
import com.grayMatter.dao.ProductDaoImpl;
import com.grayMatter.dto.ProductsDto;
import com.grayMatter.entity.Product;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProdctsService {
	
	private final ProductDaoImpl productDaoImpl;

	public ResponseEntity<?> addProduct(ProductsDto productsDto) {
		
		Product product = Product.builder()
				.productId(productsDto.getProductId())
				.productName(productsDto.getProductName())
				.productPrice(productsDto.getProductPrice())
				.productCategory(productsDto.getProductCategory())
				.productCreatedDate(LocalDate.now())
				.productImageUrl(productsDto.getProductImageUrl())
				.productDescription(productsDto.getProductDescription())
				.productStockQuantity(productsDto.getProductStockQuantity())
				.productRating(productsDto.getProductRating())
				.productTags(productsDto.getProductTags())
				.build();
		productDaoImpl.addProduct(product);
		
		return ResponseEntity.status(HttpStatus.OK).body("Product Added Successfully");
		
	}

	public ResponseEntity<?> updateProduct(ProductsDto productsDto) {
		Product product = Product.builder()
				.productId(productsDto.getProductId())
				.productName(productsDto.getProductName())
				.productPrice(productsDto.getProductPrice())
				.productCategory(productsDto.getProductCategory())
				.productCreatedDate(LocalDate.now())
				.productImageUrl(productsDto.getProductImageUrl())
				.productDescription(productsDto.getProductDescription())
				.productStockQuantity(productsDto.getProductStockQuantity())
				.productRating(productsDto.getProductRating())
				.productTags(productsDto.getProductTags())
				.build();
		productDaoImpl.addProduct(product);
		
		return ResponseEntity.status(HttpStatus.OK).body("Product Updated Successfully");

	}

	public ResponseEntity<?> deleteProduct(Long id) {
		
		Optional<Product> product = productDaoImpl.findById(id);
		
		if(!product.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found");
		}	
		productDaoImpl.deleteProduct(product.get());
		return ResponseEntity.status(HttpStatus.OK).body("Product Deleted Successfully");
	}

	public ResponseEntity<?> getAllProduct() {

		List<Product> products = productDaoImpl.getAllProduct();
		
		if(products.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product List is Empty");
		}	
		return ResponseEntity.status(HttpStatus.OK).body(products);
		
	}

	public ResponseEntity<?> GetProductById(Long productId) {

		Optional<Product> product =productDaoImpl.findById(productId);
		
		if(!product.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found");
		}	
		return ResponseEntity.status(HttpStatus.OK).body(product);
		
		
	}

	

	public ResponseEntity<?> updaeRating(Long id, String rating) {
		
		Optional<Product> product =productDaoImpl.findById(id);
		
		System.out.println(product);
		
		if(!product.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product List is Empty");
		}	
		
		product.get().setProductRating(rating);
		
		productDaoImpl.addProduct(product.get());
		
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}

	public  ResponseEntity<?> getByPrice(String start, String end) {
		List<Product> data = productDaoImpl.findByPrice(start, end);
		if(data.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found in the DataBase");
			}
			return ResponseEntity.status(HttpStatus.OK).body(data);
			
	}

	

}
