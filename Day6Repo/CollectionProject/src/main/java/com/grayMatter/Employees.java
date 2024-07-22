package com.grayMatter;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Employees implements Comparable {
	
	private int empId;
	private String empName;
	private double salary;
	private String city;
	
	
	
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employees(int empId, String empName, double salary, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.city = city;
	}
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employees e = new Employees();
		e=(Employees)o;
//		return this.getEmpId().equals(getEmpId());
		return this.empName.compareTo(e.empName);
	}
	
	

}
