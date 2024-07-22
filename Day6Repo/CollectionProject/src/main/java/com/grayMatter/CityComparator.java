package com.grayMatter;

import java.util.Comparator;

public class CityComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}
