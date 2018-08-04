package com.stackroute.exercises2;

class Member {
	String name;
	int age;
	double salary;

	public void getMembers(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		display();
	}

	public void display() {
		System.out.println("Members Name: " + name);
		System.out.println("members age: " + age);
		System.out.println("Members Salary: " + salary);
	}
}

public class MemberVariable {
	static public void main(String[] args) {
		Member obj = new Member();
		obj.getMembers("Vishnu", 22, 15);

	}
}
