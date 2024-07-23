package com.grayMatter.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoOnPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isPrime = val ->{
			if(val <= 1) {
				return false;
			}
			
			for(int i=2; i<=Math.sqrt(val);i++) {
				if(val % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 300, 7654322, 234567, 2345, 26789, 345, 67890, 809876};

        for (int val : numbers) {
        	
        	if(isPrime.test(val)) {
        		System.out.println(val + " : is a Prime Number");
        	} else {
        		System.out.println(val + " : is Not a Prime Number");
        	}
        }

	}

}
