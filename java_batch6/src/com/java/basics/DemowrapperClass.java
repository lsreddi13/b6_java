package com.java.basics;

public class DemowrapperClass {
	public static void main(String[] args) {
		
		Integer a = 3;
		
		Integer dd = new Integer(5);
		
		
		DemowrapperClass ss = new DemowrapperClass(); // obj
		
		int i = a.intValue();
		int j = a;

		System.out.println(a + " " + i + " " + j);
		// Converting int into Integer
		
		int b = 20;
		
		
		Integer k = Integer.valueOf(b);
		Integer l = b;

		System.out.println(b + " " + k + " " + l);

	}
}
