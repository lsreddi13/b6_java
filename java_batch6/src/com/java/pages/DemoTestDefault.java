package com.java.pages;

import com.java.poly.DemoDefault;

public class DemoTestDefault {

	public static void main(String[] args) {

		DemoDefault ddf = new DemoDefault();

		System.out.println(ddf.name);
		System.out.println(course); // default static member
		ddf.testMe();
		testYou(); // default static method
	}
}