package com.grayMatter.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grayMatter.entity.Users;
import com.grayMatter.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
	
	private final UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Users> user =usersRepository.findByUserEmail(username);
		
		if(!user.isPresent()) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return user.get();
		
	}

}
