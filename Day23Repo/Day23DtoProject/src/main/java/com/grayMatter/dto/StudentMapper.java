package com.grayMatter.dto;

import com.grayMatter.entity.Student;

public class StudentMapper {
	
	public Student mapToStudent(Student ss) {
		return new Student(ss.getName(), ss.getId());
	}
	
	public Student StudentToMap(Student ss) {
		return new Student(ss.getName(), ss.getId());
	}

}
