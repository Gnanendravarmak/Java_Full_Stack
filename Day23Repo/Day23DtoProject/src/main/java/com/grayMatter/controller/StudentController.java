package com.grayMatter.controller;

import org.apache.commons.logging.LogFactory;
import org.apache.naming.factory.LookupFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.grayMatter.entity.Student;
import com.grayMatter.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	 private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping("/add")
	public List<Student> getAll() {
		log.info("ll");
		return studentService.getAll();
	}
	
	@PostMapping("/post")
	public Student add(@RequestBody Student student) {
		return studentService.add(student);
	}

}
