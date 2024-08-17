package com.grayMatter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grayMatter.dao.DepartmentDao;
import com.grayMatter.entity.Department;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService {
	
	private final DepartmentDao departmentDao;
	
	public List<Department> getAll() {
		return departmentDao.getAll();
	}
	
	public Department addDep(Department department) {
		return departmentDao.addDep(department);
	}

	

}
