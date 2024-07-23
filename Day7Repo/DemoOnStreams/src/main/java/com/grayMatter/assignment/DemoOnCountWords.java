package com.grayMatter.assignment;

import java.util.Arrays;

public class DemoOnCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Lorem ipsum dolor sit amet, consectetur"
				+ "adipiscing elit. Curabitur elementum luctus tincidunt."
				+ "Suspendisse viverra sodales augue, quis molestie nisi volutpat sed."
				+ " Nunc porttitor purus eget scelerisque egestas. Mauris ornare non dui sit amet fermentum. "
				+ "Vivamus interdum in ipsum nec posuere. Morbi tincidunt dui a aliquet tristique. Nam egestas, "
				+ "felis vel tristique convallis, magna tellus sollicitudin tortor, eget congue turpis nisl eu lorem. "
				+ "Quisque efficitur ligula magna, ut molestie est fermentum in. Aliquam lacinia eleifend mauris eget maximus";
		
		
		var count = Arrays.stream(str.split("\\s+")).filter(s -> !s.isEmpty()).count();
		
		
		System.out.println("Number of words in the paragraph: " + count);
		
		

	}

}
