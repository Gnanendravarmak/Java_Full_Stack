package com.grayMatter;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		
//		findPrime(val);
		
		table(val);
		

	}
	
	public static void table(int val) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(val +" X " +i+" = "+val*i);
		}
		
	}
	
	public static void findPrime(int val) {
		
//		if(val > 0) return 0;
		
		int i=2;
		
		boolean flag = true;
		
		while (i <= Math.sqrt(val)) {
			
			
			
			if(i % val ==0) {
				flag =false;
				break;
			}
			i++;
			
		}
		
		if(flag) {
			System.out.print("prime");
		}else System.out.print("Not a prime");
		
		
	}

}
