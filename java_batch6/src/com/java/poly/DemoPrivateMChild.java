package com.java.poly;

public class DemoPrivateMChild extends DemoPrivateM {
	
	
	public static void main(String[] args) {
		DemoPrivateMChild DPM = new DemoPrivateMChild();
		System.out.println(name);
		System.out.println(DPM.name2);
		System.out.println(name3);
		System.out.println(DPM.name4);	
		
		
		test1();
		DPM.test2();
		
	}
	
	

}
