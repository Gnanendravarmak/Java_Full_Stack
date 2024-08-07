package com.grayMatter.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.grayMatter.model.Student;
import com.grayMatter.repository.StudentRepository;


@Service
public class StudentService implements StudentRepository{
	
	
	List<List<Student>> list = new ArrayList<>();

	@Override
	public boolean addStudent(Student student) {
		
		if(list.size()==0) {
			List<Student> newStudentList = new ArrayList<>();
	        newStudentList.add(student);
	        System.out.println(list);
	        return list.add(newStudentList);
		}
		
		for(List<Student> ss: list) {
			for(Student str: ss) {
				if(str.getUsn().equals(student.getUsn())) {
					return false;
				}
			}
		}
		List<Student> newStudentList = new ArrayList<>();
        newStudentList.add(student);
        System.out.println(list);
        return list.add(newStudentList);
         
	}

	@Override
	public List<List<Student>> getAllStudents() {
		return list;
	}

	@Override
	public Student getByStudentById(String usn) {
		// TODO Auto-generated method stub
		
		for(List<Student> strList: list) {
			for(Student str:strList) {
				if(str.getUsn().equals(usn)) {
					return str;
				}
			}
		}
		return null;
	}

	@Override
	public boolean updateByStudent(Student student) {
		// TODO Auto-generated method stub
		for(List<Student> strList: list) {
			for(Student str:strList) {
				if(str.getUsn().equals(student.getUsn())) {
					str.setName(student.getName());
	                str.setEmail(student.getEmail());
	                str.setPlace(student.getPlace());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean daleteStudent(Student student) {

		for(List<Student> strList: list) {
			for(Student str:strList) {
				if(str.getUsn().equals(student.getUsn()) &&
						str.getName().equals(student.getName()) && 
						str.getPlace().equals(student.getPlace())) {
					strList.remove(str);
					return true;
				}
			}
		}
		return false;
	}

}
