package com.java.DemoInheritance;

public class DemoLogin1 {
	
	public void launchApplication() {
		//open browser
		System.out.println("open browser");
		
		// open application or open login page
		System.out.println("launch application and navigate to login page.");
	}
	
	
	public void testLogin(String name) {
		//enter username
		System.out.println("enter username as "+name);
		//enter password
		System.out.println("enter password");
		//click login
		System.out.println("click login");
		
	}
	
	public void testLogout() {
		System.out.println("i am going to logout.");
	}
	
	public void closeBrowser() {
		System.out.println("browser closed.");
	}
	
	public static void main(String[] args) {
		System.out.println("test started from here.");
		//leave
		DemoLogin1 obj = new DemoLogin1();
		obj.launchApplication();
		obj.testLogin("sasi");
		obj.testLogout();
		obj.closeBrowser();
		
		
		obj.launchApplication();
		obj.testLogin("Admin");
		obj.testLogout();
		obj.closeBrowser();
		
		
		
		System.out.println("test ended  here.");
	}

}
