package com.grayMatter;

public class Demo {

	public static void main(String[] args) {
		
		int a =10;
		
		System.out.println("The value of a is: "+a);
		
		boolean bool = false;
		
		System.out.println(bool);
		
		
		int num1=78;
		int num2=155;
		
		int num3=666;
		
		System.out.println("add: "+(num1+num2));
		System.out.println("sub: "+(num1-num2));
		System.out.println("div: "+((float)(num1/num2)));
		System.out.println("rem: "+(num1%num2));
		
		
		System.out.println((num1>num2)?num1:num2);
		
		
		
		System.out.println(((num1 > num2) && (num2 > num3)?num1:(num2>num3?num2:num3)));
		
		
		num1=num1+num2+num3;
		num2=num1-num2-num3;
		num3=num1-num2-num3;

		
		
		System.out.println(num1 +" "+num2);
		
		System.out.println(num1%2==0?"Even":"Odd");
		
		System.out.println(num1 & num2);
		
		int num = -60;
		
		System.out.println(num >> 3);
		
		
		System.out.println(num1 ^ num2);
		
		
		
		
		
		
		
		
		

	}

}
