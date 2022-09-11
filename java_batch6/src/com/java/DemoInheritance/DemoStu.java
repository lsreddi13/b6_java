package com.java.DemoInheritance;

public class DemoStu {

	
	public void results(String name, int x) {
		
		
		System.out.println("Strudent name : "+ name + ", marks : "+ x);
		
		
		System.out.println("Strudent name : sandya, Marks : 990");
		System.out.println("Strudent name : Archana, Marks : 991");
		System.out.println("Strudent name : Gandadhar, Marks : 992");
		System.out.println("Strudent name : Vinod, Marks : 993");
		
	}
	
	
	public static void main(String[] args) {
		
		DemoStu obj = new DemoStu();
		
//		obj.results(90,"sasi");
		
		
		obj.results("sandya", 990);
		obj.results("Archana", 991);
		obj.results("Gangadhar", 992);


		
	}
	
	
	
}
