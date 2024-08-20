package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookName {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 


    private String title; 

 

    @ManyToOne(fetch = FetchType.LAZY) 

    @JoinColumn(name = "library_id") 

    private Library library; 

 

    // Constructors, Getters, and Setters 

 

    public BookName() {} 

 

    public BookName(String title) { 

        this.title = title; 

    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Library getLibrary() {
		return library;
	}



	public void setLibrary(Library library) {
		this.library = library;
	} 
    
    
    

}
