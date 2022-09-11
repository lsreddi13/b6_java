package com.java.arrays;

public class DemoString {
	
	public static void main(String[] args) {
	
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);  
		
		System.out.println(s);
		
		
		String s1="javatpoint";  
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  

		String name="javatpoint";  
		char ch2=name.charAt(10);//returns the char value at the 10th index  
		System.out.println(ch2); 
		
		
		
		
		
	}

}
