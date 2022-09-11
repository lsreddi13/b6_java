package com.java.thiskey;

public class DT2 {

	int rollno;
	String name;
	double fee;

	DT2(int rollno, String name, double fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}
