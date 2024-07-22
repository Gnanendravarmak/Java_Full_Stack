package com.grayMatter;

import java.util.Comparator;

public class NameComparator implements Comparator<Employees>{



	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
