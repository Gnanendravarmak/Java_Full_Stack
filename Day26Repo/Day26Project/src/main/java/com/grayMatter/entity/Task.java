package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	
	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	    private Long id; 

	 

	    private String description; 

	 

	    @ManyToOne(fetch = FetchType.LAZY) 
	    @JoinColumn(name = "project_id") 
	    private Project project; 

	 

	    // Constructors, Getters, and Setters 

	 

	    public Task() {} 

	 

	    public Task(String description) { 

	        this.description = description; 

	    }



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public Project getProject() {
			return project;
		}



		public void setProject(Project project) {
			this.project = project;
		} 
	    
	    

}
