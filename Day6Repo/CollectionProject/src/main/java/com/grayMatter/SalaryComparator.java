package com.grayMatter;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary() - o2.getSalary());
	}

	

}
