package com.grayMatter.utils;
import java.io.IOException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.grayMatter.service.JwtService;
import com.grayMatter.service.MyUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SpringSecurityFilter extends OncePerRequestFilter {
	
	
	private final JwtService jwtService;
	
	private final MyUserDetailsService myUserDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, 
			HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {

		String authHeader = request.getHeader("Authorization");
		
		String userEmail = null;
		String token = null;
		
		if(authHeader == null || !authHeader.startsWith("Bearer ")) {
			
			filterChain.doFilter(request, response);
			return;
			
		}
		
		token = authHeader.substring(7);
		userEmail = jwtService.extractUserName(token);
		
		if(userEmail != null || SecurityContextHolder.getContext().getAuthentication() == null) {
			
			UserDetails userDetails = myUserDetailsService.loadUserByUsername(userEmail);
			
			if(jwtService.isValidate(token, userEmail)) {
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails,
						null,
						userDetails.getAuthorities()
						);
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}
		filterChain.doFilter(request, response);
		
	}
	
	

}
