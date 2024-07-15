package com.grayMatter;

import java.util.Scanner;

public class NumUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Value: ");
		
		int val = sc.nextInt();
		
		switch(val) {
		case 1: System.out.println("One");
		break;
		
		case 2: System.out.println("Two");
		break;
		
		case 3: System.out.println("Three");
		break;
		
		case 4: System.out.println("Four");
		break;
		
		case 5: System.out.println("Five");
		break;
		
		case 6: System.out.println("Six");
		break;
		
		case 7: System.out.println("Seven");
		break;
		
		case 8: System.out.println("Eight");
		break;
		
		case 9: System.out.println("Nine");
		break;
		
		case 10: System.out.println("Ten");
		break;
		}

	}

}
