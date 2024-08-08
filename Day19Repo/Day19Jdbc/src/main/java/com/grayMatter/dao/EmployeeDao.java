package com.grayMatter.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.grayMatter.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbctemplate;
	
	
	
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	public int addEmployee(Employee emp) {
		String query = "insert into employee values ("+emp.getEmpId()+",'"+emp.getEmpName()+"',"+emp.getEmpSal()+");";
		return jdbctemplate.update(query);
	}
	
	
	public List<Employee> getAllEmployees() {
		
		String query = "select * from employee";
		return jdbctemplate.query(query, new EmployeeRowMapper());
		
	}
	
	
	public int updateEmployee(Employee emp) {
		String query = "update employee set empSal="+emp.getEmpSal()+" where empId="+emp.getEmpId();
		return jdbctemplate.update(query);
	}

	
	public int daleteEmployee(String id) {
		String query = "delete from employee where empId="+id;
		return jdbctemplate.update(query);
	}
}