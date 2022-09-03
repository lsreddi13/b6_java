package com.java.basics;

public class DemoReturnMethods_debug {

	public static void main(String[] args) {
		DemoReturnMethods_debug obj_ref = new DemoReturnMethods_debug();

		
		String str = "sasidhar";
		System.out.println(str);
		 str = r1();

		System.out.println(str);

	}
	
	public static String r1() {
		String name = "Sasi";
		return name;
	}

}
