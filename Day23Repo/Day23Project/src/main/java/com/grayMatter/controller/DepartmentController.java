package com.grayMatter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.grayMatter.entity.Department;
import com.grayMatter.service.DepartmentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DepartmentController {
	
	private final DepartmentService departmentService;
	
	@GetMapping("/getAll")
	public List<Department> getAll() {
		return departmentService.getAll();
	}
	
	@PostMapping("/add")
	public Department add(@RequestBody Department department) {
		return departmentService.addDep(department);
	}
	

}
