package com.grayMatter;


public class DemoOnAccessModifiers {
	
	public static void main(String[] args) {
		DemoAccess demo = new DemoAccess();
		
		demo.name = "varma";
		
		System.out.println(demo.name);
		
		demo.new Inner().innerName="Hello Varma";
	}
	


}
