package com.grayMatter.beans;

import java.util.Arrays;
import java.util.List;

public class Courses {
	
	private int id;

	public Courses(int id) {
		super();
		this.id = id;
	}
	
	public Courses() {
		
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + "]";
	}
	
	
	
	
	
//	private List<String > list = Arrays.asList("Java","cpp","python","Spring Boot");

}
