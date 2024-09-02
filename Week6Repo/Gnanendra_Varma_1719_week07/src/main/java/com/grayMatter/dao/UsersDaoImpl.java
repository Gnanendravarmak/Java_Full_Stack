package com.grayMatter.dao;

import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.entity.Product;
import com.grayMatter.entity.Role;
import com.grayMatter.entity.Users;
import com.grayMatter.repository.ProductsRepository;
import com.grayMatter.repository.UsersRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UsersDaoImpl {

	private final UsersRepository usersRepository;
	private final ProductsRepository productsRepository;
	
	public Users signIn(Users user) {
		return usersRepository.save(user);
	}

	public Optional<Users> findByRole(String role) {
		return usersRepository.findByRole(role);	
	}

	public Optional<Users> findByUserEmail(String userEmail) {
		return usersRepository.findByUserEmail(userEmail);
	}

	public Product findByProduactName(String name) {
		return productsRepository.findByProductName(name);
	}

	public Product findByProductCategory(String name) {
		return productsRepository.findByProductCategory(name);
	}

	public Product findByProductTags(String name) {
		return productsRepository.findByProductTagsContains(name);
	}

	public Optional<Product> findByProductId(Long id) {
		return productsRepository.findById(id);
	}

	public Product addProduct(Product product) {
		return productsRepository.save(product);
	}

	

}
