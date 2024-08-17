package com.grayMatter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.entity.Department;
import com.grayMatter.entity.Employee;
import com.grayMatter.exception.ResourseNotFound;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	private final EmployeeDao employeeDao;
	
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
	
	public Employee addemployee(Employee employee) {
		return employeeDao.addemployee(employee);
	}

	public List<Employee> findByEmpName(String name) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmpName(name);
	}

	public List<Employee> findByEmpId(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmpId(id);
	}

	public List<Employee> getAllEmployeesByDepartment(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByDepartment_DeptId(id);
	}

	public List<Employee> findByEmpNameStartingWith(String name) {
		// TODO Auto-generated method stub
		return employeeDao.findByEmpNameStartingWith(name);
	}

	public Employee findById(int id) throws ResourseNotFound {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

}
