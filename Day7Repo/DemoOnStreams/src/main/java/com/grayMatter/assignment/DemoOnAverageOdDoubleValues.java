package com.grayMatter.assignment;

import java.util.*;

public class DemoOnAverageOdDoubleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> list = Arrays.asList(1.2, 3.4, 5.6, 7.8, 9.0);
		
		
		OptionalDouble val = list.stream()
		.mapToDouble(Double::doubleValue)
		.average();
		
		 if (val.isPresent()) {
	         System.out.println("The average value is: " + val.getAsDouble());
	     } else {
	         System.out.println("The list is empty.");
	     }
		
		
		

	}

}
