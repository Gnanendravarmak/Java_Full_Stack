package com.grayMatter.service;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Department;
import com.grayMatter.entity.Employee;
import com.grayMatter.repository.DepartmentRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository; 

	 
	public void add() {
		Department dept =new Department("Eng");
		dept.addEmployee(new Employee("CSE"));
		dept.addEmployee(new Employee("AIML"));
		departmentRepository.save(dept);
	}

    @Transactional
    public void deleteDepartment(Long departmentId) { 

        departmentRepository.deleteById(departmentId); 

    } 

}
