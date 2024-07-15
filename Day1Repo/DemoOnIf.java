package com.grayMatter;

import java.util.Scanner;

public class DemoOnIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean flag = true;
//		
//		if(!flag) System.out.print("Hai");
//		else System.out.println("Bye");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter Operator: ");
		String op = sc.next();
		
		if(op.equals("+")) {
			System.out.println(a+b);
		}else if(op.equals("-")) {
			System.out.println(a-b);
		}else if(op.equals("*")) {
			System.out.println(a*b);
		}else if(op.equals("/")) {
			System.out.println((float)a/b);
		}else if(op.equals("%")) {
			System.out.println(a%b);
		}else {
			System.out.println("Enter Correct Operator");
		}
		
		//		if(((val1&0) == 0)) {
//			System.out.println("Even Number");
//		}else System.out.println("Odd Number");
		
//		int val2 = sc.nextInt();
//		
//		if(val1 > val2) System.out.println(val1 +" is larger Number"); 
//		else System.out.println(val2 +" is larger Number");
		
		
		
		
	}

}
