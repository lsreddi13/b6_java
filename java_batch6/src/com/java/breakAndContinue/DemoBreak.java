package com.java.breakAndContinue;

public class DemoBreak {

	public static void main(String[] args) {
		String[] st = { "vinod", "Gangadhar", "Vishnu", "Asif", "Archana", "Prasanth", "Deva", "sasi" };

		for (int k = 0; k < st.length; k++) {
//			System.out.println(st[k]);
			if (st[k].equalsIgnoreCase("Vishnu"))

				break;
			System.out.println(st[k]);

		}
		
		
		

	}

}
