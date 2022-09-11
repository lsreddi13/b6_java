package com.java.Strings;

import org.openqa.selenium.By;

public class DemoStringSplit {

	
	public static void main(String[] args) {
		
		
		String name = "Selenium * WebApplication automation * tool";
		
		
		String[] ar = name.split(" ");
		
		for(String s : ar) {
			System.out.println(s);
		}
		
		
		String value = "About dsd 16,600 results (100.39 seconds) ";
		
		int a = value.indexOf("(");
		System.out.println(a);
		
		System.out.println(value.charAt(22));
		
		System.out.println(value.substring(22, 28));
		
		
		System.out.println(value.indexOf("result"));
		
		System.out.println(value.substring(value.indexOf("result"), value.indexOf("result")+6));
		
		value.isEmpty();
		
		String sss = "Selenium test automation sasi test manual test interview test functional test";
		
		
		System.out.println(sss.lastIndexOf("test"));
		
//		String resultText = driver.findElement(By.id("result-stats")).getText();
		
//		System.out.println(resultText);
	}//Selenium
	//WebApplication
	//automation
	//tool
	
	//test
//	Selenium
	//
}
