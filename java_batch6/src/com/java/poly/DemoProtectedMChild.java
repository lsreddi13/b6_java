package com.java.poly;

public class DemoProtectedMChild extends DemoProtectedM{

	
	public static void main(String[] args) {

		DemoProtectedMChild DPM = new DemoProtectedMChild();

		System.out.println(name);
		System.out.println(DPM.name2);
		System.out.println(name3);
		System.out.println(DPM.name4);		
		test1();
		DPM.test2();
		

	}

}
