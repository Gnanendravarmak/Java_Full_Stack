package com.grayMatter.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {
	
	private final String secret = "oWdfkZpVKy8r1+sQK3UZQ6DzFoWTgY4avP1V/MjJ3Sg=";


	public String generateToken(String useEmail) {
		Map<String,Object> claims = new HashMap<>();
		return generateToken(claims,useEmail);
	}


	private String generateToken(Map<String, Object> claims, String useEmail) {
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(useEmail)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 60*60*10*1000))
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

	
	
	public Claims extractAllClaims(String token) {
		return Jwts.parser()
				.setSigningKey(secret)
				.build()
				.parseClaimsJws(token)
				.getBody();
	}


	public String extractUserName(String token) {
		return extractAllClaims(token).getSubject();
	}
	
	public boolean isValidate(String token, String userEmail) {
		String email = extractAllClaims(token).getSubject();
		return email.equals(userEmail) && !isTokenExpired(token);
	}


	private boolean isTokenExpired(String token) {
		return extractAllClaims(token).getExpiration().before(new Date(System.currentTimeMillis()));
	}
	
	

	
	
	

}
