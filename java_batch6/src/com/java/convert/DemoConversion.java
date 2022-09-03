package com.java.convert;

public class DemoConversion {
//	"30 items selected."

	static int cart_item_count = 30; // int to string
	static Integer item_count = 25; // int to string
	static String text = " items selected.";
	static String text2 = "sss";

	public static void main(String[] args) {
		
//		System.out.println(cart_item_count+" items selected.");
//		
//		System.out.println("---------------");
//		System.out.println(cart_item_count + text);
//		
//		
//		System.out.println("--------------");
//		System.out.println(text.concat(text2));
//		
//	
//		convert int to string
		String s=String.valueOf(cart_item_count);
		
		
		 
		System.out.println(s.concat(text));
		
		String s2=Integer.toString(cart_item_count); 
		
		System.out.println(s2.concat(text));
		
		
		
		String s3=String.format("%d",cart_item_count);  
		
		System.out.println(s3.concat(text));
		
		
	}
}
