package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Book {
	
	@Value("${Book.bookName}")
	private String bookName;
	@Value("${Book.isfc}")
	private String isfc;
	@Value("${Book.price}")
	private double price; 
	
	@Autowired
	private Author author;
}
