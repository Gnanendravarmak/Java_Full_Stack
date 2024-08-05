package com.grayMatter.beans;

import java.util.Set;

public class Student {
	
	private String name;
	private String exam;
	private Set<Courses> courses;
	public Student(String name, String exam, Set<Courses> courses) {
		super();
		this.name = name;
		this.exam = exam;
		this.courses = courses;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExam() {
		return exam;
	}
	public void setExam(String exam) {
		this.exam = exam;
	}
	public Set<Courses> getCourses() {
		return courses;
	}
	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", exam=" + exam + ", courses=" + courses + "]";
	}
	
	
	

}
