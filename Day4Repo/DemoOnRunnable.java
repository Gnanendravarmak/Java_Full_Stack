package com.grayMatter;

public class DemoOnRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new MyClass());
		
		t1.start();

	}

}
