package com.grayMatter;

public interface CalculatorInterface {

	void addValue(int a, int b);
	void subValue(int a, int b);
	void mulValue(int a, int b);
	void divValue(int a, int b);
	static void powValue(int a, int b) {
		System.out.println("Power in calInterface");
	}
	static void sqrtValue(int a) {
		System.out.println("sqrt in calInterface");
	}
}
