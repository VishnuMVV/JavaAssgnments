package com.stackroute.exercises3;

public class TestInterface implements Alter {
	public void getDetails(String s) {
		System.out.println(s);
	}

	public int Display(int res) {
		int out = res;
		return out;
	}

	public void fee(int id) {
		System.out.println(id);
	}

	static public void main(String[] a) {
		TestInterface obj = new TestInterface();
		Time objTime = new Time();
		DateDemo objDate = new DateDemo();

		obj.getDetails("Vishnu");
		int result = obj.Display(98);
		System.out.println(result);
		obj.fee(59);
		objTime.setTime(12, 12, 30);
		String dueTime = objTime.toString();
		System.out.println(dueTime);
		String dueDate = objDate.dateMthd();
		System.out.println(dueDate);
	}

}
