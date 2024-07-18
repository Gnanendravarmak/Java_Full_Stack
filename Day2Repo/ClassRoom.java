package com.grayMatter;

import java.util.Arrays;

public class ClassRoom {
	
	int calssNum;
	int floorNum;
	Student st[];
	
	
	public ClassRoom(int calssNum, int floorNum,Student st[]) {
		super();
		this.calssNum = calssNum;
		this.floorNum = floorNum;
		this.st=st;
	}
	
	public ClassRoom() {
		super();
	}

	public ClassRoom(int calssNum, int floorNum) {
		super();
		this.calssNum = calssNum;
		this.floorNum = floorNum;
	}

	@Override
	public String toString() {
		return "ClassRoom [calssNum=" + calssNum + ", floorNum=" + floorNum + ", st=" + Arrays.toString(st) + "]";
	}
	
	
	
	

}
