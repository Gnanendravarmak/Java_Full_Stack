package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	
	@Id
//	@GeneratedValue
	private int empId;
	private String empName;
	private double empSal;
	
	
	@ManyToOne
	@JoinColumn(name ="department_employee", referencedColumnName = "deptId")
	private Department department;
}
