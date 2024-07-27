package com.grayMatter;

public class Sender<T> {

	private T person;
	
	public Sender(T person) {
		super();
		this.person = person;
	}

	@Override
	public String toString() {
		return "Sender [person=" + person + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(new Sender<>(2));
		
		System.out.println(new Sender("Hello"));

	}

}
