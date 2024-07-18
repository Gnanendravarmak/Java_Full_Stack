package com.grayMatter;

public class DemoOnExceptions {
	
	public static void doDiv(int a,int b) {
		
		if(b==0) throw new ArithmeticException();
		
		System.out.println(a/b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nume=7,demo=0;
		
		try {
			System.out.println(nume/demo);
		} catch(ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("Hendled");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("last line");
		
		try {
			doDiv(5,0);
		} catch(ArithmeticException e)  {
			e.printStackTrace();
		}
		
		

	}

}
