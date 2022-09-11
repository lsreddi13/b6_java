package com.java.DemoInheritance;

public class DemoMethodParam {

	int c;
	
	double k;

	public void add(int a, int b) {
		c = a + b;
		System.out.println(c);
	}
	
	public void add() {
		c = 50+60;
		System.out.println(c);
	}

	public void sub(double x, double y) {
		 k = x - y;
	}
//
//	public void mul() {
//c=a*b
//	}

	public static void main(String[] args) {
		
		DemoMethodParam obj = new DemoMethodParam();
		
		obj.add();
		obj.add(3,2);
		obj.add(30,20);		
		obj.add(50,60);
		obj.add(53,52);
		
		
	}

}
