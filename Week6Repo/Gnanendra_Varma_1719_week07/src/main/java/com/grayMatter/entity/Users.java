package com.grayMatter.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Users implements UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String userName;
	
	private String userEmail;
	
	private String password;
	
//	@Enumerated(EnumType.STRING)
//	private Role role;
	
	private String role;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
        return List.of(new SimpleGrantedAuthority("ROLE_" + role));
	}

	@Override
	public String getUsername() {
		return userEmail;
	}
	

}
