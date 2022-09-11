package com.java.constructors;

public class DemoC {

	public DemoC() {
		System.out.println("this is default constructor.");
	}
	
	public DemoC(String address) { // it is not return type - should not use void or return
//logic
		System.out.println("this is constructor."+ address);
	}

	// what is the diff between method and constructor.

//	3 bullet points

	public static void test3(String name) {
		System.out.println("this is test3 method."+name);
	}

	public void DemoC3() {
		// logic
		System.out.println("this is democ3 method. - this is void method ( non return type method.");
	}

	public int DemoC4() {
		// logic
		System.out.println("this is democ4 method - int return type method.");
		return 45;
	}

	String name = "JAVA";

	public static void main(String[] args) {
		DemoC dc3 = new DemoC();
		DemoC dc = new DemoC("selenium java");
		dc.DemoC3();

		System.out.println(dc.name);
		
		test3("sasidhar");

	}

}
