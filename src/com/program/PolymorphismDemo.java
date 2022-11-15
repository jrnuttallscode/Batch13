package com.program;
//one single thing taking many forms
//there are 2 types of polymorphism 
//static polymorphism or compile time: method overloading 
//dynamic polymorphism or run time: method overriding
public class PolymorphismDemo {
	
	//method overloading 
	//its having one single method name but different no.of, type and order of parameter

	public void add(int a) {
		
	}
	
	public void add(int a,int b) {
		
	}
	
	public void add(double a, double b) {
		
	}
	
	public void add(String a, String b) {
		
	}
	public static void main(String[] args) {
		PolymorphismDemo d = new PolymorphismDemo();
		d.add(1);
		d.add(10,20);
		d.add(10.0,20.0);
		d.add("abc", "somthing");

	}

}