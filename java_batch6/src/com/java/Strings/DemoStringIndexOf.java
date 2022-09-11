package com.java.Strings;

public class DemoStringIndexOf {

	public static void main(String[] args) {
		//what do you know about the string.
		  String s1 = "This is sasi method indexOf method";            
		int index = s1.indexOf("method", 5); //Returns the index of this substring  
		
		 System.out.println("index of substring "+index);  
		
		   
	     index = s1.indexOf("vinod", 29); // It returns -1 if substring does not found  
	        System.out.println("index of substring "+index);          
		   
	        
	        String st = "Password : admin123. Username. Password. Login. Forgot your password? OrangeHRM OS 5.1. © 2005 - 2022 OrangeHRM, Inc. All rights reserved. orangehrm-logo.";
	        
//	        int x = st.indexOf("Login") ;
	        
	        System.out.println(st.indexOf("Login"));
	        
//	        System.out.println(x);
	}
	
	
}
