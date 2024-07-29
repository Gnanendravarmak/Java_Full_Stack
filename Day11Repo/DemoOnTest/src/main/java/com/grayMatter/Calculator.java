package com.grayMatter;

public class Calculator {
	
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	
	
	public boolean isEven(int num) {
		return num%2==0;
	}
	
	
	public int findKey(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String isnull(String val) {
		// TODO Auto-generated method stub
		return val;
	}
	
	

}
