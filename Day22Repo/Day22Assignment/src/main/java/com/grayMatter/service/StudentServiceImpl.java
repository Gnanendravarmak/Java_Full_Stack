package com.grayMatter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grayMatter.entity.Student;
import com.grayMatter.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentServiceInterface  {
	
	public final StudentRepository studentRepository;

	public List<Student> getAllData() {
		return studentRepository.findAll();
	}

	public Optional<Student> getById(int id) {
		return studentRepository.findById(id);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);;
	}

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student update(Student student, Student newStudent) {
		
		student.setDepartment(newStudent.getDepartment());
		
		return studentRepository.save(student);
	}

}
