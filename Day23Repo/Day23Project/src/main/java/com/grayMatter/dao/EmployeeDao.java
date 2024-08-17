package com.grayMatter.dao;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

import com.grayMatter.entity.Department;
import com.grayMatter.entity.Employee;
import com.grayMatter.exception.ResourseNotFound;
import com.grayMatter.repository.EmployeeRepositort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeDao {
	
	private final EmployeeRepositort employeeRepositort;
	
	
	public List<Employee> getAll() {
		return employeeRepositort.findAll();
	}
	
	public Employee addemployee(Employee employee) {
		return employeeRepositort.save(employee);
	}

	public List<Employee> findByEmpName(String name) {
		// TODO Auto-generated method stub
		return employeeRepositort.findByEmpName(name);
	}

	public List<Employee> findByEmpId(int id) {
		// TODO Auto-generated method stub
		return employeeRepositort.findByEmpId(id);
	}

	public List<Employee> findByDepartment_DeptId(int id) {
		// TODO Auto-generated method stub
		return employeeRepositort. findByDepartment_DeptId(id);
	}

	public List<Employee> findByEmpNameStartingWith(String name) {
		// TODO Auto-generated method stub
		return employeeRepositort.findByEmpNameEndsWith(name);
	}

	public Employee findById(int id) throws ResourseNotFound {
		// TODO Auto-generated method stub
		return employeeRepositort.findById(id).orElseThrow(()->new ResourseNotFound("Not User"));
	}

	

}
