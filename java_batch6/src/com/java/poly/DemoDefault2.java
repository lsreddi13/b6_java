package com.java.poly;

public class DemoDefault2 extends DemoDefault {

	public static void main(String[] args) {

		DemoDefault ddf = new DemoDefault();

		System.out.println(ddf.name);
		System.out.println(course); // default static member
		ddf.testMe();
		testYou(); // default static method

	}
}
