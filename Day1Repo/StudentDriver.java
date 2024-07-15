package com.grayMatter;

public class StudentDriver {
	
	public static void main(String[] args) {
//		Student ss= new Student();
//		
//		System.out.println(ss);
//		
//		ss.setName("Varma");
//		ss.setId(12);
//		ss.setM1(20);
//		ss.setM2(22);
//		ss.setM3(30);
//		
//		System.out.println(ss);
//		
//		System.out.println("Using Getters");
//		
//		System.out.println(ss.getName());
//		System.out.println(ss.getId());
//		System.out.println(ss.getM1());
//		System.out.println(ss.getM2());
//		System.out.println(ss.getM3());
		
		
		
		Student s1= new Student("Gnanendra Varma",11,70,80,76);
		
		System.out.println("Student Marks Are: ");
		
		System.out.println("Name: "+s1.getName());
		System.out.println("Id: "+s1.getId());
		System.out.println("M1 Marks :"+s1.getM1());
		System.out.println("M2 Marks :"+s1.getM2());
		System.out.println("M3 Marks :"+s1.getM3());
		
//		System.out.println(s1);
		
		int avg = (s1.getM1()+s1.getM2()+s1.getM3())/3;
		
		System.out.println("Avg Marks are: "+ avg);
		
		findRank(avg);
		
		
		
		
		
		
		
		
		
	}
	
	public static void findRank(int rank) {
		
		if(rank > 60) {
			System.out.println("First Rank With : "+ rank);
		} else if(rank < 60 && rank > 40) {
			System.out.println("Second Rank With : "+rank);
		} else {
			System.out.println("Failed");
		}
		
	}

}
