package com.grayMatter;

public abstract class AbstractClass {
	
	private String name;
	
	public String printName(String name) {
		this.name = name;
		return name;
	}
	
	public abstract void sayHello() ;

}
