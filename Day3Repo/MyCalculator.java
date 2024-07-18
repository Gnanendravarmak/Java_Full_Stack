package com.grayMatter;

public class MyCalculator implements CalculatorInterface {

	@Override
	public void addValue(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void subValue(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void mulValue(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}

	@Override
	public void divValue(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		
	}

	
	
	public void powValue(int a, int b) {
		System.out.println("Power in class");
	}
	
	
	public  void sqrtValue(int a) {
		System.out.println("sqrt in class");
	}

}
