package com.grayMatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grayMatter.beans.Author;
import com.grayMatter.beans.Book;

//@Configuration
@ComponentScan("com.graymatter.beans")
@PropertySource("classpath:bookdata.properties")
public class BookConfig {
	
//	@Bean(name="book")
//	public Book getBook() {
//		return new Book("java","2356",7889.8,author());
//	}
	
//	@Bean
//	public Author author() {
//		return new Author("varma","457");
//	}

}
