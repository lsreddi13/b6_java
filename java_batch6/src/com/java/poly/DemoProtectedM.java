package com.java.poly;

public class DemoProtectedM {

	protected static String name = "sasi";
	protected String name2 = "sasi2";
	protected final static String name3 = "sasi3";
	protected final String name4 = "sasi4";

	protected static void test1() {
		System.out.println("this is protected test1 method in same package");
	}

	protected void test2() {
		System.out.println("this is protected test1 method in same package");
	}

	public static void main(String[] args) {

		DemoProtectedM DPM = new DemoProtectedM();

		System.out.println(name);
		System.out.println(DPM.name2);
		System.out.println(name3);
		System.out.println(DPM.name4);		
		test1();
		DPM.test2();
		

	}

}
