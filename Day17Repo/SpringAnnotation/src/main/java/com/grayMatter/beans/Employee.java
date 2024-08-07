package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@PropertySource("classpath:db.properties")
public class Employee {
	
	@Value("${Employee.empId}")
	String empId;
	@Value("${Employee.empName}")
	String empName;
	@Value("${Employee.empSal}")
	String empSal;
	
	@Autowired
	Departmant department;

	public Employee(String empId, String empName, String empSal, Departmant department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
	}
	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department=" + department
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
