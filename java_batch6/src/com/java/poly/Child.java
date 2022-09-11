package com.java.poly;

public class Child extends Parent {
//	public void login(String name) {
//		System.out.println("this is Child login : "+name);
//	}
//	public void logout() {
//		System.out.println("this is child logout");
//	}
	public static void main(String[] args) {
//		Child c = new Child(); //child class object
//		c.login("sasi");
//		c.logout();//		
//		Parent p = new Parent();
//		p.login("sasi2");
//		p.logout();	
//		
		Parent pc = new Child();
		pc.login("sasi3");
		pc.logout();
		
		
//		Child cp = new Parent();
//		cp.login("sasi4");
//		cp.logout();
		
	}

}
