package com.grayMatter.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.grayMatter.entity.Student;
import com.grayMatter.repositoty.StudentRepository;
import java.util.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Profile(value = "dev")
public class StudentService {
	
	
	private final StudentRepository studentRepository;
	
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student add(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
