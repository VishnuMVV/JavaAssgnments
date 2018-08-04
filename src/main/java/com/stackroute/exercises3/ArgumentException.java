package com.stackroute.exercises3;
//program which demonstrates exception handling
public class ArgumentException {

	public static void main(String[] args) {
		//try block for
		try {
			throw new Exception("Invalid");
		} catch (Exception e) {//we are handling the exception thrown in try block
			System.out.println(e);
		} finally {//finally block for result statement
			System.out.println("Completed");
		}
	}

}
