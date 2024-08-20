package com.grayMatter.entity;


import java.util.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 

 

    private String name; 

 

    @OneToMany(mappedBy = "library", cascade = {CascadeType.DETACH,CascadeType.PERSIST},orphanRemoval = true ) 

    private List<BookName> books = new ArrayList<>(); 

 

    // Constructors, Getters, and Setters 

 

    public Library() {} 

 

    public Library(String name) { 

        this.name = name; 

    } 

 

    public void addBook(BookName book) { 

        books.add(book); 

        book.setLibrary(this); 

    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<BookName> getBooks() {
		return books;
	}



	public void setBooks(List<BookName> books) {
		this.books = books;
	} 
    
    
    

}
