package com.grayMatter.controller;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.dto.ProductsDto;
import com.grayMatter.entity.Product;
import com.grayMatter.service.ProdctsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3001")
public class ProductsController {
	
	private final ProdctsService productsService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody ProductsDto productsDto) {
		return productsService.addProduct(productsDto);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<?> updateProduct(@RequestBody ProductsDto productsDto) {
		return productsService.updateProduct(productsDto);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable Long id) {
		System.out.println("Product");
		return productsService.deleteProduct(id);
	}
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<?> GetAllProduct() {
		return productsService.getAllProduct();
	}
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<?> GetProductById(@PathVariable Long productId ) {
		return productsService.GetProductById(productId);
	}
	
	
//	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	@PutMapping("/rateProduct/{Id}/{rating}")
	public ResponseEntity<?> updaeRating(@PathVariable Long Id, @PathVariable String rating) {
		System.out.println(Id);
		System.out.println(rating);
		return productsService.updaeRating(Id, rating);
	}
	
	@GetMapping("/getByprice/{start}/{end}")
	public ResponseEntity<?> getByPrice(@PathVariable String start, @PathVariable String end) {
		return productsService.getByPrice(start, end);
	}
	
	
	

}
