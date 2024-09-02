package com.grayMatter.dto;

import com.grayMatter.entity.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UsersDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@NotBlank(message = "User name cannot be blank")
	@Size(min = 3, max = 50, message = "User name must be between 3 and 50 characters")
	private String userName;

	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Invalid email format")
	@Pattern(
		    regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
		    message = "Email must contain both '.' and '@' and follow a valid email format"
		)
	private String userEmail;

	@NotBlank(message = "Password cannot be blank")
	@Size(min = 6, message = "Password must be at least 6 characters long")
	private String password;

	@NotBlank(message = "Role cannot be blank")
	private String role;

}
