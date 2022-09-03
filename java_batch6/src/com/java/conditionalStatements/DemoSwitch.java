package com.java.conditionalStatements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSwitch {
	public static void main(String[] args) {

		//selenium
		//java
		//manual testing
		//interview Q discussion
		
		
		//chrome
		//edge
		//firefox
		//opera
		WebDriver driver;
		String url = "http://www.facebook.com";
		
		String topic ="chrome";
		switch(topic) {
		case "chrome" :
			//System.out.println("this is selenium topic");
			
			System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\AutomationSoftwares\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			
			
			driver.get(url);
			break;
		case "edge" :
			//System.out.println("this is java topic");
			System.setProperty( "webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\AutomationSoftwares\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			
			
			driver.get(url);
			
			break;
		case "firefox" :
			//System.out.println("this is manual testing topic");
			System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\AutomationSoftwares\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
			
			
			driver.get(url);
			break;
		
			
		}
		
		
		
		
		
		
		
		/*
		 * int day = 1; switch (day) { case 1: System.out.println("Monday"); break; case
		 * 2: System.out.println("Tuesday"); break; case 3:
		 * System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; case 5: System.out.println("Friday");
		 * break; case 6: System.out.println("Saturday"); break; case 7:
		 * System.out.println("Sunday"); break; } // Outputs "Thursday" (day 4
		 */
	}
}
