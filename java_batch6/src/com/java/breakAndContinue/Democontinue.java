package com.java.breakAndContinue;

public class Democontinue {

	public static void main(String[] args) {
		String[] st = { "vinod", "Gangadhar", "Vishnu", "Asif", "Archana", "Prasanth", "Deva", "sasi" };

		for (int k = 0; k < st.length; k++) {

			if (st[k].equalsIgnoreCase("Vishnu"))

				continue;
			System.out.println(st[k]);
		}
	}

}
