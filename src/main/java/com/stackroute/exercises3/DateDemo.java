package com.stackroute.exercises3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MMMM-dd");
	String myDate = dateFormat.format(date);

	public String dateMthd() {
		return myDate;
	}
}
