package com.stackroute.exercises3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Type {
	public static void main(String[] args) {
		Field[] fields = java.lang.Integer.class.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			Class type = f.getType();
			System.out.println(type);
			System.out.println(type.getCanonicalName());
		}
	}
}
