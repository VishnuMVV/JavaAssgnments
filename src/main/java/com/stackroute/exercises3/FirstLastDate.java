package com.stackroute.exercises3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstLastDate {
	static public void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EE dd/MM/YYYY");
		System.out.println("Today: " + dateFormat.format(date));
		System.out.print("First Date of week: ");
		Calendar c = Calendar.getInstance();
		while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
			c.add(Calendar.DATE, -1);
		}
		System.out.println(dateFormat.format(c.getTime()));
		System.out.print("Last Date of week: ");
		while (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
			c.add(Calendar.DATE, 1);
		}
		System.out.println(dateFormat.format(c.getTime()));

	}
}
