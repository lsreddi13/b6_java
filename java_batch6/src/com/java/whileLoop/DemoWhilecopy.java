package com.java.whileLoop;

/*
 * this is while loop. we can iterate the statement multiple times until the condition statifies.
 */
public class DemoWhile {

	public static void main(String[] args) {

		// print 1 to 10 numbers
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println(i);
//		}

		// print 50 to 60 numbers
		int i = 50;

		while (i < 61) {

			System.out.println(i);
			i++;
		}

		String[] st = { "vinod", "Gangadhar", "Vishnu", "Asif", "Archana", "Prasanth", "Deva", "sasi" };

//		for (int k = 0; k < st.length; k++) {
//			System.out.println(st[k]);
//		}

		int k = 0;
		while (k < st.length) {
			System.out.println(st[k]);
			k++;
		}
	}

}
