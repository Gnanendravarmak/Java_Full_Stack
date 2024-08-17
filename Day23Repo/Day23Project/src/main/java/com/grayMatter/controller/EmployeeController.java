package com.grayMatter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.entity.Department;
import com.grayMatter.entity.Employee;
import com.grayMatter.exception.ResourseNotFound;
import com.grayMatter.service.DepartmentService;
import com.grayMatter.service.EmployeeService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/api/v1/emp/")
@RequiredArgsConstructor
public class EmployeeController {
	
	
	private final EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		return employeeService.addemployee(employee);
	}
	
	@GetMapping("/getName/{name}")
	public List<Employee> citCity(@PathVariable String name) {
		return employeeService.findByEmpName(name);
	}
	
	@GetMapping("/getId/{id}")
	public List<Employee> getById(@PathVariable int id) {
		return employeeService.findByEmpId(id);
	}
	
	@GetMapping("/get/{id}")
	public List<Employee> getDept(@PathVariable int id) {
		return employeeService.getAllEmployeesByDepartment(id);
	}
	
	
	@GetMapping("/getEmp/{name}")
	public List<Employee> getDept(@PathVariable String name) {
		return employeeService.findByEmpNameStartingWith(name);
	}
	
	@GetMapping("/getId/{id}")
	public Employee getBy(@PathVariable int id) throws ResourseNotFound {
		return employeeService.findById(id);
	}
	
	
}
