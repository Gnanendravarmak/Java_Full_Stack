package com.grayMatter;

public class DemoOnOverLoadimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DemoOnOverLoadimg dd =new DemoOnOverLoadimg();
		
		dd.add(34, 56);
		dd.add(4.5f, 5.6f);
		dd.add(4.5, 6.7,8.9,3.4);
		dd.add("Hello ", "World");
		
		Complex c1 = new Complex(3,4);
		Complex c2 = new Complex(5,7);
		
		dd.add(c1, c2);
		
		

	}
	
	public void add (int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(float f1,float f2) {
		System.out.println(f1+f2);
	}
	
	public void add(String s1,String s2) {
		System.out.println(s1+s2);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(double d1,double d2,double d3,double d4) {
		System.out.println(d1+d2+d3+d4);
	}
	
	
	public void add (int a, double b) {
		System.out.println(a+b);
	}
	
	public void add(double f1,float f2) {
		System.out.println(f1+f2);
	}

	
	public void add(Complex c1,Complex c2) {
		Complex cc = new Complex();
		
		cc.img = c1.img+c2.img;
		cc.real=c1.real+c2.real;
		
		System.out.println(cc.real+"+"+cc.img+"i");
	}
	
	

}
