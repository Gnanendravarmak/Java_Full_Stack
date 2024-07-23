package com.grayMatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnBuiltInFunctionalInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> consumer = (i) -> System.out.println(i);
		consumer.accept(90);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach(consumer);
		
		
		Supplier<String> supplier = () -> "Hello";		
		System.out.println(supplier.get());
		
		Predicate<Integer> predicate = (num) -> num%2==0;
	
		
		int arr[] = {15, 34, 56, 77, 89, 112};
		
		for (int num : arr) {
            if (predicate.test(num)) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
		
		
		Function<Integer, Integer> function = (num) -> {
			int fact =1;
			for(int i=1; i<=num;i++) {
				fact *=i;
			}
			return fact;
		};
		
		System.out.println(function.apply(5));


	}

}
