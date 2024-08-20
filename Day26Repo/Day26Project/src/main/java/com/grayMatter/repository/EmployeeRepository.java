package com.grayMatter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> { 

} 
