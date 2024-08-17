package com.grayMatter.dao;

import org.springframework.stereotype.Service;
import java.util.*;

import com.grayMatter.entity.Department;
import com.grayMatter.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentDao {
	
	private final DepartmentRepository departmentRepository;
	
	
	public List<Department> getAll() {
		return departmentRepository.findAll();
	}
	
	public Department addDep(Department department) {
		return departmentRepository.save(department);
	}

	

}
