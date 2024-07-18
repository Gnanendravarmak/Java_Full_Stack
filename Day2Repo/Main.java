package com.grayMatter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
		System.out.println(emp);
		
		Employee emp1 = new Employee("varma",22,"123456789","varma@gmail.com",new Date("22/22/22"),"Accunt",1234,new Date("33/33/33"));
		
		System.out.println(emp1);
		
		System.out.println(emp1 instanceof Persion);
		
		
		Customer cc = new Customer("varma",11,"987654321","varma@gmail.com",new Date("22/22/22"),99.0987,23);
		
		System.out.println(cc);
		
		

	}

}
