package com.grayMatter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.service.UsersService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UsersService usersService;
	
	
	@GetMapping("/getName/{name}")
	public ResponseEntity<?> getByName(@PathVariable String name) {
		return usersService.getByName(name);
	}
	
	@GetMapping("/getByCategory/{name}")
	public ResponseEntity<?> getByCategoty(@PathVariable String name) {
		return usersService.getByCategoty(name);
	}
	
	@GetMapping("/getByTags/{name}")
	public ResponseEntity<?> getByTags(@PathVariable String name) {
		return usersService.getByTags(name);
	}
	
	@PutMapping("/rating/{Id}/{name}")
	public ResponseEntity<?> getRating(@PathVariable Long Id, @PathVariable String name) {
		return usersService.getRating(Id, name);
	}

	
	
	
	

}
