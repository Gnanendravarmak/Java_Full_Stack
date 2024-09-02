package com.grayMatter.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.UsersDaoImpl;
import com.grayMatter.dto.UsersDto;
import com.grayMatter.dto.UsersRequest;
import com.grayMatter.entity.Product;
import com.grayMatter.entity.Users;

import lombok.RequiredArgsConstructor;
import java.util.*;

@Service
@RequiredArgsConstructor
public class UsersService {
	
	private final UsersDaoImpl usersDaoImpl;
	
	private final JwtService jwtService;
	
	private final AuthenticationManager authenticationManager;
	
	private final PasswordEncoder passwordEncoder;

	public ResponseEntity<?> signIn(UsersDto usersDto) {
		
		
		System.out.println(usersDto);
		
		
		if(usersDto.getRole().equalsIgnoreCase("ADMIN")) {
			Optional<Users> user = usersDaoImpl.findByRole("ADMIN");
			
			if(user.isPresent()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Access Denied");
			}
		}
		
		
		Optional<Users> email = usersDaoImpl.findByUserEmail(usersDto.getUserEmail());
		
		System.out.println(email);
		
		if(email.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Account Already Exists");
		}
		
		System.out.println("Inside");
		
		Users userData = Users.builder()
				.userId(usersDto.getUserId())
				.userName(usersDto.getUserName())
				.userEmail(usersDto.getUserEmail())
				.password(passwordEncoder.encode(usersDto.getPassword()))
				.role(usersDto.getRole())
				.build();
		
		Users data = usersDaoImpl.signIn(userData);
		
		return ResponseEntity.status(HttpStatus.OK).body("Account Created Successfully");

	}

	public ResponseEntity<?> logIn(UsersRequest usersRequest) {
		
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usersRequest.getUserEmail(),
				usersRequest.getPassword()));
		
		Optional<Users> email = usersDaoImpl.findByUserEmail(usersRequest.getUserEmail());
		
		if(!email.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please Create An Account");
		}
		
		String token = jwtService.generateToken(usersRequest.getUserEmail());
		
		return ResponseEntity.status(HttpStatus.OK).body(token+" "+email.get().getRole());

		
		
	}

	public ResponseEntity<?> getByName(String name) {
		
		Product product = usersDaoImpl.findByProduactName(name);
		
		if(product == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found in the DataBase");
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);

	}

	public ResponseEntity<?> getByCategoty(String name) {

		Product product = usersDaoImpl.findByProductCategory(name);
		
		if(product == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Catagory Not Found in the DataBase");
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
		
	}

	public ResponseEntity<?> getByTags(String name) {
		
		System.out.println(name);
		
		String[] str = name.split(",");
		
		List<Product> data = new ArrayList<>();
		
		for(String ss: str) {
			
			System.out.println(ss.trim());
			
			Product product = usersDaoImpl.findByProductTags(ss.trim());
			
			System.out.println(product);
			
			if(product != null) {
				data.add(product);
			}
			
			
		}
		
		if(data.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found in the DataBase");
		}
		
		
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}

	

	public ResponseEntity<?> getRating(Long id, String name) {
		Optional<Product> data = usersDaoImpl.findByProductId(id);
		
		if(!data.isPresent()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Product Not Found in the DataBase");
		}
		
		data.get().setProductRating(name);
		Product product = usersDaoImpl.addProduct(data.get());
		return ResponseEntity.status(HttpStatus.OK).body("Rating Updated");

	}

}
