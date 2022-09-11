package com.java.Strings;

public class DemoStrings {

	static String str1 = "Selenium Automation";

	public static void main(String[] args) {
	
		System.out.println("String length : "+str1.length());
		
		
		String str2 = "Test Automation";
		System.out.println("String length : "+str2.length());
		
		char s3 = str2.charAt(8);
		
		System.out.println(s3);
		
	
		
		boolean val = str2.contains("automation");
		
		System.out.println(val);
		

		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.toUpperCase());

	}

}
