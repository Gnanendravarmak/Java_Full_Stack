package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Student;
import com.grayMatter.repository.StudentRepository;
import com.grayMatter.service.StudentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentController {
	

	private final StudentService studentService;
	
	@GetMapping("/log")
	public String doLog() {
		System.out.println("fghjl;");
		return "login";
	}
	
	
	@RequestMapping("/welcome")
	public String get() {
		return "home";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname, @RequestParam String pass) {
		if(uname.equals("varma") && pass.equals("password")) {
			return new ModelAndView("home");
		}
		return new ModelAndView("login");
	}
	
	@RequestMapping("/add")
	public String add() {
		return "addStudent";
	}
	
	@RequestMapping("/upp")
	public String upp() {
		return "update";
	}
	
	@RequestMapping("/del")
	public String del() {
		return "delete";
	}
	
	@RequestMapping("/get")
	public String getBy() {
		return "getById";
	}
	
	@RequestMapping("/getAll")
	public String getAll() {
		return "getAllData";
	}
	
	@RequestMapping("/getAllData")
	public ModelAndView getAllData() {
	    List<List<Student>> data = studentService.getAllStudents();
	    List<Student> newData = new ArrayList<>();

	    for (List<Student> sublist : data) {
	        newData.addAll(sublist);
	    }
	    
	    System.out.println("Data: "+newData);
	    ModelAndView mv = new ModelAndView("display");
	    mv.addObject("data", newData);
	    return mv;
	}

	
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@RequestParam String usn, 
			@RequestParam String name, 
			@RequestParam String email, 
			@RequestParam String place) {
		Student student = new Student(usn, name, email, place);
		
		System.out.println("adding student");
		
		if(studentService.addStudent(student)) {
			return new ModelAndView("home");
		}
		
		return new ModelAndView("error");
	}
	
	
	@RequestMapping("/getById")
	public ModelAndView getById(@RequestParam String usn) {
		ModelAndView mv;
		if(studentService.getByStudentById(usn)!= null) {
			System.out.println("Inside method");
			mv = new ModelAndView("disData");
			mv.addObject("data",studentService.getByStudentById(usn));
			return mv;
		}
		return new ModelAndView("error");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam String usn, 
			@RequestParam String name, 
			@RequestParam String email, 
			@RequestParam String place) {
		if(studentService.daleteStudent(new Student(usn, name, email, place))) {
			return new ModelAndView("home");
		}
		return new ModelAndView("error");
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam String usn, 
			@RequestParam String name, 
			@RequestParam String email, 
			@RequestParam String place) {
		if(studentService.updateByStudent(new Student(usn, name, email, place))) {
			return new ModelAndView("home");
		}
		return new ModelAndView("error");
	}
	
	

	
	

}
