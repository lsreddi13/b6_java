package com.java.DemoInheritance;

import com.java.datatypes.DemoParam2;

public class DemoMethodParamOrder {
	
	public static void main(String[] args) {
		//dynamically send person details
		
		DemoParam2 DP2 = new DemoParam2();
		
		DP2.personDetails2("gangadhar", "levaku", "barathnagar, hyd", 89898989);
		DP2.personDetails2("Vinod", "abc", "kukatpally, hyd", 12345); // reusing method and diff data
		DemoParam DP = new DemoParam();
		DP.personDetails("gangadhar2", "levaku", "barathnagar, hyd", 89898989);
		DP.personDetails("Vinod2", "abc", "kukatpally, hyd", 12345); // reusing method and diff data
		
		
		
	}

	
	
	
}
