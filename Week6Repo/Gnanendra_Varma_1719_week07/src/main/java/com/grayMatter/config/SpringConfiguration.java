package com.grayMatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.grayMatter.utils.SpringSecurityFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SpringConfiguration {
	
	
	private final AuthenticationProvider authenticationProvider;
	
	
	private final SpringSecurityFilter springSecurityFilter;
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		  http.cors().and().csrf().disable()
	        .authorizeHttpRequests()
	        .requestMatchers("/api/v1/auth/login","/api/v1/auth/signup")
	        .permitAll()
//	        .requestMatchers("/api/v1/admin/**").hasRole("ADMIN")
            // Specific operation under /api/v1/admin/view-profile is allowed for USER and ADMIN
//            .requestMatchers("/api/v1/products/rateProduct/**").hasAnyRole("USER", "ADMIN")
	        .anyRequest()
	        .authenticated()
	        .and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	        .and()
	        .authenticationProvider(authenticationProvider)
	        .addFilterBefore(springSecurityFilter, UsernamePasswordAuthenticationFilter.class);
	    
	    return http.build();
	}

}
