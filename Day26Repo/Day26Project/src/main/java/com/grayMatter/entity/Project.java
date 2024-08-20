package com.grayMatter.entity;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Project {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    private Long id; 

 

    private String name; 

 

    @OneToMany(mappedBy = "project", cascade = CascadeType.MERGE, orphanRemoval = true) 

    private List<Task> tasks = new ArrayList<>(); 
    
    public Project() {} 

    

    public Project(String name) { 

        this.name = name; 

    } 

 

    public void addTask(Task task) { 

        tasks.add(task); 

        task.setProject(this); 

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



	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	} 
    
    

}
