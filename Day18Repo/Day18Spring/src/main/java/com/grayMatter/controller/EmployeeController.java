package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Employee;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/doLog")
	public String doLog() {
		return "login";
	}
	
	
	
	
	
	@RequestMapping("/login") 
	public ModelAndView login(@RequestParam String uname,@RequestParam String pass) {
		ModelAndView mv;
		
		
		if(uname.equals("varma") && pass.equals("password")) {
			mv = new ModelAndView("addEmp");
		}else {
			mv= new ModelAndView("login");
		}
		
//		System.out.println(uname+ " "+pass);
//		mv.addObject(uname);
		return mv;
	}
	
	
	@RequestMapping("/addEmp")
	public ModelAndView add (@RequestParam String id, @RequestParam String name,@RequestParam String sal) {
		
		
		Employee emp = new Employee(Integer.parseInt(id),name,Integer.parseInt(sal));
		ModelAndView mv = new ModelAndView("emp");
		mv.addObject("emp1", emp);
		
		return mv;
	}
	
	@RequestMapping("/employee")
	public ModelAndView getEmpInfo() {
		Employee emp = new Employee(1,"varma",8999);
		ModelAndView mv = new ModelAndView("emp");
		mv.addObject("emp1",emp);
//		mv.addObject("emp");
		return mv;
	}

}
