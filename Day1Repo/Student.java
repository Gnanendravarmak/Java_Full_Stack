package com.grayMatter;

public class Student {
	
	private String name;
	private int id;
	private int m1,m2,m3;
	
	
	public Student() {
		super();
	}


	public Student(String name, int id, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.m1 = this.m2 = this.m3 = 40;
	}
	
	public Student(String name, int id,int m) {
		super();
		this.name = name;
		this.id = id;
		this.m1 = this.m2 = this.m3 = m;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}


	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	public int getM3() {
		return m3;
	}


	public void setM3(int m3) {
		this.m3 = m3;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	
	

}
