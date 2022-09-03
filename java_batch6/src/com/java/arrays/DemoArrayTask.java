package com.java.arrays;

import java.util.Arrays;

public class DemoArrayTask {

	public static void main(String[] args) {
		System.out.println("hello Arrays");

		// int array
		int[] ar = new int[10];
		ar[0] = 5;

		System.out.println("size of the array : " + ar.length); // 10
		System.out.println("print array values : " + Arrays.toString(ar));

		String[] emp = { "vishnu", "archana", "Sandya" };

		System.out.println("first emp name : " + emp[0]);
		
		
		
		String[] prm = emp;
		
		
		System.out.println("print new string array values : "+ Arrays.toString(prm));

	}

}
