package com.grayMatter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
	
	private String usn;
	private String name;
	private String email;
	private String place;
	
	

}
