package com.java.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class DemoArray {

	public static void main(String[] args) {

		int[] id = { 300000, 2300000, 3300000, 4300000, 5300000, 6300000, 7, 8 };
//		
//		System.out.println(id.length);
//		
//		System.out.println(id[7]);
//		
//		
//		System.out.println(sal);
		System.out.println(Arrays.toString(id));

		id[0] = 300;
		System.out.println(Arrays.toString(id));

		System.out.println("Original Array: " + Arrays.toString(id));

		System.out.println("*****************************");

		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		System.out.println("*****************************");

		for (int i = id.length - 1; i >= 0; i--) {
			System.out.println(id[i]);
		}
		System.out.println("*****************************");

		
		int[] emp_id= new int[id.length];
		
		System.out.println("new array size : "+emp_id.length);
		
		System.out.println(Arrays.toString(emp_id));
		
		emp_id[5] = 40;
		
		System.out.println(Arrays.toString(emp_id));
		
		
		for (int i = 0; i < emp_id.length; i++) {
			
			emp_id[i] = id[i];
		}
		
		System.out.println("new array values : "+Arrays.toString(emp_id));
		System.out.println("old array values : "+Arrays.toString(id));
		
		
	}
	
	

}
