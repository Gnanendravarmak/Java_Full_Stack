package com.grayMatter.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Student;
import com.grayMatter.service.StudentServiceImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentDao {
	
	private final StudentServiceImpl studentServiceImpl;

	public List<Student> getAllData() {
		return studentServiceImpl.getAllData();
	}

	public Optional<Student> getById(int id) {
		return studentServiceImpl.getById(id);
	}

	public void deleteById(int id) {
		 studentServiceImpl.delete(id);
	}

	public Student addStudent(Student student) {
		return studentServiceImpl.addStudent(student);
	}

	public Student update(Student oldstudent, Student newSudent) {
		return studentServiceImpl.update(oldstudent, newSudent);
	}

}
