package com.grayMatter;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		
		findPrime(val);
		
		table(val);
		

	}
	
	public static void table(int val) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(val +" X " +i+" = "+val*i);
		}
		
	}
	
	public static void findPrime(int val) {
	    if (val <= 1) {
	        System.out.println("Not a prime");
	        return;
	    }

	    boolean flag = true;
	    
	    for (int i = 2; i <= Math.sqrt(val); i++) {
	        if (val % i == 0) {
	            flag = false;
	            break;
	        }
	    }
	    
	    if (flag) {
	        System.out.println("Prime");
	    } else {
	        System.out.println("Not a prime");
	    }
	}


}
