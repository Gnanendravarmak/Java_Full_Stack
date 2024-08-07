package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departmant { 
	
	@Value("${Department.depName}")
	String depName;
	@Value("${Department.depId}")
	int depId;

}
