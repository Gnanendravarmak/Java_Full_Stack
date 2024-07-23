package com.grayMatter.assignment;

import java.util.*;

public class DemoOnVoating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Person> personData = new HashSet<>();
		
		personData.add(new Person("varma", 21, "Guntur", "123456789"));
		personData.add(new Person("kiran", 22, "Bapatla", "976432334"));
		personData.add(new Person("ashok", 32, "vijayawada", "98765434567"));
		personData.add(new Person("avinash", 12, "Bangalore", "6345635678"));
		personData.add(new Person("likith", 22, "Tirupathi", "4567653456"));
		
		
		personData.stream()
        .forEach(person -> {
            if (person.getAge() < 18) {
                System.out.println(person.getName() + " is not eligible for voting."+ new Exception("Age is Not Sufficient!!"));
            } else {
                System.out.println(person.getName() + " voting success.");
            }
        });

	}

}
