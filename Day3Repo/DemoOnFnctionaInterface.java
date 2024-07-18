package com.grayMatter;

public class DemoOnFnctionaInterface implements MyFunctionalInterface {
	
	public static void main(String[] args) {
		DemoOnFnctionaInterface dd = new DemoOnFnctionaInterface();
		
		System.out.println(dd.cubeOfNum(6));
	}

	@Override
	public int cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
