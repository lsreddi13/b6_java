package com.java.pages;

import com.java.poly.DemoProtectedM;

public class DemoProtectedMChild2 extends DemoProtectedM{

	
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
