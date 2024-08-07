package com.grayMatter.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.List;

import com.grayMatter.model.Student;



@Service
public interface StudentRepository {
	
	

	
	boolean addStudent(Student student);
	List<List<Student>> getAllStudents();
	Student getByStudentById(String usn);
	boolean updateByStudent(Student student);
	boolean daleteStudent(Student student);

}
