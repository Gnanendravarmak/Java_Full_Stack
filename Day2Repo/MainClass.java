package com.grayMatter;

public class MainClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		
		School sc = new School("KV","Hyd");
		
		MainClass main = new MainClass();
		
		main.finalize();
		
		
		
		Student s1= new Student("amr",123);
		
		Student s2= new Student("hello",167);
		
		Student s3= new Student("varma",456);
		
		Student st[] = {s1,s2,s3};
		
		ClassRoom c = new ClassRoom(7,4,st);
		
		System.out.println(sc);
		
		System.out.println();
		System.out.println(c);
		
		System.out.println(s1);
		
		System.out.println(s2);
		System.out.println(s3);
		
//		System.gc();
		
		
		
		
		
		
		
		
		
		
		

	}
	
	protected void finalize() throws Throwable {
		
		System.out.println("Manuay invoking");
		System.gc();
	}
	
	

}
