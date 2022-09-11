package com.java.iterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//import java.util.Iterator;

public class DemoIteration {

	public static void main(String[] args) {
		List<String> st = Arrays.asList("vinod", "Gangadhar", "Vishnu", "Asif", "Archana", "Prasanth", "Deva", "sasi");

		System.out.println(st.size());
		
		
//		Iterator itr = st.;	
		Iterator iterator = st.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
	}

}
