package com.grayMatter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	  private Long id; 

	    private String empName; 

	    @ManyToOne(fetch = FetchType.LAZY) 
	    @JoinColumn(name = "department_id") 
	    private Department department; 

	 

	    // Constructors, Getters, and Setters 

	 

	    public Employee() {} 

	 

	    public Employee(String empName) { 

	        this.empName = empName; 

	    }



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getName() {
			return empName;
		}



		public void setName(String empName) {
			this.empName = empName;
		}



		public Department getDepartment() {
			return department;
		}



		public void setDepartment(Department department) {
			this.department = department;
		} 

	 

	    // Getters and Setters 

}
