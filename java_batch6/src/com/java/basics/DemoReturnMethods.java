package com.java.basics;

public class DemoReturnMethods {

	public static void main(String[] args) {
		DemoReturnMethods obj_ref = new DemoReturnMethods();
//		r1();
		String str = r1();
//		System.out.println(r1());
		System.out.println(str);
		String r = loginTest();
		System.out.println("result value : " + r);

		int r2 = obj_ref.loginTest2();
		System.out.println("result value : " + r2);

		
		
		int r3 = obj_ref.loginTest3();
		System.out.println(r3);
	}

	public  int loginTest2() {

		int c;

		int a = 2;
		int b = 2;

		if (a == b) {
			// condition satisfied
			c = a + b;
		} else {
			// condition not satisfied
			c = 0;
		}

		return c;

	}
	
	public  int loginTest3() {

		int c;

		int a = 2;
		int b = 2;

		if (a == b) {
			// condition satisfied
			c = a + b;
		} else {
			// condition not satisfied
			c = 0;
		}

		return c;

	}


	public static String loginTest() {

		String result;

		int a = 3;
		int b = 2;

		if (a == b) {
			// condition satisfied
			result = "pass";
		} else {
			// condition not satisfied
			result = "fail";
		}

		return result;

	}

	public static String r1() {

		String name = "Sasi";
		return name;
	}

}
