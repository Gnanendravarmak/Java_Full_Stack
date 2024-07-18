package com.grayMatter;

public class DemoOnAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AbstractClass ac  = new AbstractClass();
//		
//		ac.sayHello();
		
		AbstractChildClass ac = new AbstractChildClass();
		ac.sayHello();
		
		System.out.println(ac.printName("Varma"));
		
		

	}

}
