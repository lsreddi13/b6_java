package com.java.poly;

public class DemoMOLoading {

	public static void main(String[] args) {
		DemoMOLoading a = new DemoMOLoading();
		a.test1();
		a.test1(56);
		a.test1(334.9);
		a.test1("sasi");
		a.test1(3234, "fdasf");
		a.test1("fdasf", 888);		
	}

	public void test1() {
		System.out.println("hello");
	}

	public void test1(int id) {
		System.out.println("id");
	}

	public void test1(String namme) {
		System.out.println("hello string");
	}

	public void test1(double dd) {
		System.out.println("hello double ");
	}

	public void test1(int pancard, String name) {
		System.out.println("hello two");
	}
	
	public void test1(String name,  int pancard) {
		System.out.println("hello two");
	}

}
