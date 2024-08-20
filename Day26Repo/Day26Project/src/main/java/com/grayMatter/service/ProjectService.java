package com.grayMatter.service;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Project;
import com.grayMatter.entity.Task;
import com.grayMatter.repository.ProjectRepository;
import java.util.*;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectService {
	
	private final ProjectRepository projectRepository; 
	
	
	
	public void addProject() {
		Project p = new Project("subject");
		Task task = new Task("adminLogin");
		p.addTask(task);
		projectRepository.save(p);
		
	}
	
	
	  @Transactional

	    public void updateProject(Long projectId, String newName, List<Task> newTasks) { 

	        Project project = projectRepository.findById(projectId).orElseThrow(() -> new RuntimeException("Project not found")); 

	 

	        // Update the project's name 

	        project.setName(newName); 

	 

	        // Clear existing tasks and add new ones 

	        project.getTasks().clear(); 

	        for (Task task : newTasks) { 

	            project.addTask(task); 

	        } 

	 

	        // Save the project (this will also merge the tasks) 

	        projectRepository.save(project); 

	    } 

}
