package com.java.convert;

public class DemoStringToInt {
//	"30 items selected."

	static String cart_item_count = "30"; // int to string
	

	public static void main(String[] args) {
		
		System.out.println(cart_item_count+30);
		
		
		int i=Integer.parseInt(cart_item_count);  
		
		System.out.println(i+30);
		
	}
}
