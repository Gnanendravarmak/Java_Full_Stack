package com.grayMatter;

public class Square extends Shape {
	
	double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square() {
		super();
	}
	
	public void getArea() {
		System.out.println(side * side);
	}
	
	public void perimeter() {
		System.out.println(4*side);
	}
	
	

}
