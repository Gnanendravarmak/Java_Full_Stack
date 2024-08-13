package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Size(min=4, message="name should be more than 4 char length")
	private String name;
	
	@Size(min=3, message="name should be more than 3 char length")
	private String usn;
	
	@Size(min=2, message="name should be more than 2 char length")
	private String department;
	

}
