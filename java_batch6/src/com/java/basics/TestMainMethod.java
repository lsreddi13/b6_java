package com.java.basics;

public class TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Good Morning");

		TestMainMethod obj = new TestMainMethod();
		obj.nonStaticMethod();
		staticMethod();

	}

	// void method - non static method
	public void nonStaticMethod() {

		staticMethod();
		System.out.println("non static hello");
	}

	public void nonStaticMethod2() {
		nonStaticMethod();
		staticMethod();
		System.out.println("non static hello");
	}

	public static void staticMethod() {
		System.out.println("static hello");
	}

}
