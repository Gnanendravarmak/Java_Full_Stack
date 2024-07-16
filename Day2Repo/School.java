package com.grayMatter;

import java.util.Arrays;

public class School {
	
	String schooName;
	
	String address;
	
	ClassRoom cr[];

	public School() {
		super();
		
	}

	public School(String schooName, String address) {
		super();
		this.schooName = schooName;
		this.address = address;
		ClassRoom c1 = new ClassRoom(3,2);
		
		ClassRoom c2 = new ClassRoom(5,1);
		
		ClassRoom cr[] = {c1,c2};
	
		this.cr = cr;
	}

	@Override
	public String toString() {
		return "School [schooName=" + schooName + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
	}
	
	
	
	
	
	
	
	
	

}
