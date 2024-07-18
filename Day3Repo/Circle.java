package com.grayMatter;

public class Circle {
	
	double radius;
	static final double pi=3.14;
	
	public void getArea() {
		System.out.println(pi*radius*radius);
	}
	
	public void perimeter() {
		System.out.println(2*pi*radius);
	}

}
