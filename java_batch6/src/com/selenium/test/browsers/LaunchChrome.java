package com.selenium.test.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	//verify warning message if user enter invalid login data.
	public static void main(String[] args) {
		
		//initialize webdriver
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\AutomationSoftwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://www.facebook.com";
		
		driver.get(url);
		
		String pagetitle = driver.getTitle();
		
		System.out.println(pagetitle);
		
	
		
		
		
		
		//enter email or phone number
		driver.findElement(By.id("email")).sendKeys("fasdfasdfa fdas");
		//enter password
		driver.findElement(By.name("pass")).sendKeys("mypassword");
		
		//click login
		driver.findElement(By.tagName("button")).click();
		
		//verify warning message
		String errorMessage = driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println(errorMessage);
		//print warning message
		
		
		
//		driver.close();
		
	}

}
