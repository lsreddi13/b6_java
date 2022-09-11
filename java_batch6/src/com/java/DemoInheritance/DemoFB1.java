package com.java.DemoInheritance;

public class DemoFB1 {

	public void openBrowser() {
		System.out.println("open browser");
	}

	public void testLogin(String name) {
		System.out.println("login as " + name);
	}

	public void testUploadPhoto(String name) {
		System.out.println("upload " + name + " photo");
	}
	public void testLogout() {
		System.out.println("logout");
	}
	public static void main(String[] args) {

		DemoFB1 obj = new DemoFB1();
		obj.openBrowser();
		obj.testLogin("sasi");
		obj.testUploadPhoto("sasi");
		obj.testLogout();
	
		obj.testLogin("archana");
		obj.testUploadPhoto("archana");
		obj.testLogout();
	
		obj.testLogin("sandya");
		obj.testUploadPhoto("sandya");
		obj.testLogout();

	}

}
