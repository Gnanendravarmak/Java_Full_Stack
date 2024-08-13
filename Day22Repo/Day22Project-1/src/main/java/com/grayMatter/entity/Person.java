package com.grayMatter.entity;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {
	
	
	@Id
	private Long aadharnum;
	
	@Size(min=3, message= "person name mst be more than 3 char length")
	private String name;
	
	@NotBlank
	@Pattern(regexp = "[6789][0-9]{9}", message="mobile number must be of 10 length")
	private String mobileNum;
	
	@Range(min = 18, message="Age must be more than 18 to cast vote")
	private int age;
	
	@Email
	private String email;

}
