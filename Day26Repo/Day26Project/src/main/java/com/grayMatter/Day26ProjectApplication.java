package com.grayMatter;


import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grayMatter.entity.Task;
import com.grayMatter.service.AuthorService;
import com.grayMatter.service.DepartmentService;
import com.grayMatter.service.LibraryService;
import com.grayMatter.service.OrderService;
import com.grayMatter.service.ProjectService;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class Day26ProjectApplication implements CommandLineRunner{
	
	private final AuthorService authorService;
	
	private final DepartmentService departmentService;
	private final OrderService orderService;
	private final ProjectService projectService;
	private final LibraryService libraryService;

	public static void main(String[] args) {
		SpringApplication.run(Day26ProjectApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
//		authorService.saveAuthorWithBooks();
//		 authorService.removeAuthor(2L);
		
//		departmentService.add();
//		departmentService.deleteDepartment(3L);
		
		
//		orderService.createOrderWithItems();
		
//		projectService.addProject();
//		Task task1 = new Task("Description of Task 1");
//		Task task2 = new Task("Description of Task 2");        
//        List<Task> tasks = new ArrayList<>();
//        tasks.add(task1);
//        tasks.add(task2);
//		projectService.updateProject(1L, "subject", tasks);
		
		
		libraryService.add();
		libraryService.detachLibrary(1L);
		
	}

}
