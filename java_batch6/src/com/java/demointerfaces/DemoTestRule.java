package com.java.demointerfaces;

import com.java.datatypes.DemoParam2;

public class DemoTestRule extends DemoParam2 implements Rule1, Rule2, Rule3 {

	public static void main(String[] args) {

		DemoTestRule DTR = new DemoTestRule();

		DTR.test1rule3();

		personDetails2("name", "surname", "addres", 440);
	}

	public void test1rule3() {
		// TODO Auto-generated method stub
		System.out.println("test1rule3");
	}

	public void test2rule3() {
		// TODO Auto-generated method stub

	}

	public void test3rule3() {
		// TODO Auto-generated method stub

	}

	public void test1rule2() {
		// TODO Auto-generated method stub

	}

	public void test2rule2() {
		// TODO Auto-generated method stub

	}

	public void test3rule2() {
		// TODO Auto-generated method stub

	}

	public void test1rule1() {
		// TODO Auto-generated method stub

	}

	public void test2rule1() {
		// TODO Auto-generated method stub

	}

	public void test3rule1() {
		// TODO Auto-generated method stub

	}

}
