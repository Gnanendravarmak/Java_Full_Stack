package com.grayMatter.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Department {
	
	private String deptName;
	
	@Id
	private int deptId;
	
	@OneToMany(mappedBy = "department")
	@JsonIgnore
	private List<Employee> empList;
	

}
