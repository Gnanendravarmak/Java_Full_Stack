package com.grayMatter;

import java.util.Scanner;

public class DemoOnSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter Operator: ");
		String op = sc.next();
		
		
		
		
		switch(op) {
		
			case "+":
					System.out.println(a+b);
					break;
			case "-":
					System.out.println(a-b);
					break;
			case "*":
					System.out.println(a*b);
					break;
			case "/":
					System.out.println((float)a/b);
					break;
			case "%":
					System.out.println(a%b);
					break;
			default:
					System.out.println("Enter Correct Operator");
			
			
		
		}
		
	
	}

}
