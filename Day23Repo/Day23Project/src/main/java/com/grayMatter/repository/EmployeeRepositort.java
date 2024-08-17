package com.grayMatter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Department;
import com.grayMatter.entity.Employee;


@Repository
public interface EmployeeRepositort extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmpName(String name);

	List<Employee> findByEmpId(int id);

	List<Employee> findByDepartment_DeptId(int deptId);
	
	List<Employee> findByEmpNameEndsWith(String name);

}
