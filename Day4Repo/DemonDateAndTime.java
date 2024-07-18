package com.grayMatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class DemonDateAndTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date = new Date("7/18/2024");
		
		System.out.println(date);
		
//		SimpleDateFormat dd = new SimpleDateFormat("dd-MMM-yyyy",Locale.US);
//		
//		String myDate = "18-JUL-2024";
//		
//		Date d = dd.parse(myDate);
//		
//		System.out.println(d);
//		
//		
//		LocalDate ll = LocalDate.now();
//		
//		System.out.println(ll);
//		
//		System.out.println(LocalDate.parse(myDate));
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(LocalDate.now().format(formatter));
		
		
		
//		LocalDate date = LocalDate.now();
		
		
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		
		System.out.println(date.getTime());
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
		String myJoing = "2022-03-23";
		LocalDate doj = LocalDate.parse(myJoing);
		
		String myLeaving = "2012-07-12";
		LocalDate doi = LocalDate.parse(myLeaving);
		
		Period p = Period.between(doj, doi);
		
		System.out.println(p.getDays());
		
		System.out.println(p.getMonths());
		
		System.out.println(p.getYears());
		
		
		
		
		
		
		

		

	}

}
