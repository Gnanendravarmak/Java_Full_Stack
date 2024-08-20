package com.grayMatter.entity;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long authorId;
	private String name;
	
	@OneToMany(mappedBy = "authorName", cascade = CascadeType.REMOVE)
	private List<Book> books = new ArrayList<>();;
	
	public Author() {}
	
	 public Author(String name) {
		 this.name = name;
	 }
	 
	 public void addBook(Book book) {
		 books.add(book);
		 book.setAuthorName(this);
	 }
	 
	 public void removeBook(Book book) {
		 books.remove(book);
		 book.setAuthorName(null);
	 }

}
