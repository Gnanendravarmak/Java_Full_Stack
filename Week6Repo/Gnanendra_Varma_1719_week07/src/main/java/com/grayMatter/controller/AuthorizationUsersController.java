package com.grayMatter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.dto.UsersDto;
import com.grayMatter.dto.UsersRequest;
import com.grayMatter.service.UsersService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@CrossOrigin("http://localhost:3001")
public class AuthorizationUsersController {
	
	private final UsersService usersService;
	
	
	@PostMapping("/signup")
	public ResponseEntity<?> signIn(@RequestBody UsersDto usersDto) {
		return usersService.signIn(usersDto);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> logIn(@RequestBody UsersRequest usersRequest) {
		return usersService.logIn(usersRequest);
	}
	
}
