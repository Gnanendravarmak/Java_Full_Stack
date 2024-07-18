package com.grayMatter;

public class Main {

	public static void main(String[] args) throws AgeNotSufficientException {
		// TODO Auto-generated method stub
		
		Persion p = new Persion("varma","12345",18);
		
		
		if(p.getAge() < 18) {
			throw new AgeNotSufficientException("age must be greater than 18");
		}else {
			System.out.println("Persion eligible for voting"+p);
		}
		
		

	}

}
