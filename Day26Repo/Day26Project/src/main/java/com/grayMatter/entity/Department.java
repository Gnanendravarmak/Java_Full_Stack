package com.grayMatter.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.*;


@Entity
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; 

    private String deptName; 


    @OneToMany(mappedBy = "department", cascade = { CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true) 

    private List<Employee> employees = new ArrayList<>(); 


    public Department() {} 


    public Department(String deptName) { 
        this.deptName = deptName; 
    } 

 
    public void addEmployee(Employee employee) { 
        employees.add(employee); 
        employee.setDepartment(this); 
    } 
}
