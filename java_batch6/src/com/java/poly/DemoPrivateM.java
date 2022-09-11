package com.java.poly;

public class DemoPrivateM {

	private static String name = "sasi";
	private String name2 = "sasi2";
	private final static String name3 = "sasi3";
	private final String name4 = "sasi4";

	private static void test1() {
		System.out.println("this is private test1 method");
	}

	private void test2() {
		System.out.println("this is private test1 method");
	}

	public static void main(String[] args) {

		DemoPrivateM DPM = new DemoPrivateM();

		System.out.println(name);
		System.out.println(DPM.name2);
		System.out.println(name3);
		System.out.println(DPM.name4);		
		test1();
		DPM.test2();
		

	}

}
