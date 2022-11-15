package com.program;


public class StaticBlockDemo2 {
	//JVM is capable of loading it before main method 
	//so its just used for some initialization not much of the logic is included
	//this block cannot refer anything from outside 
	static{
		int a = 2000;
		System.out.println(a);
	}
	
	//static variable
	static int a; //this is 0 as no value is assigned; it gets a default value = 0
	
	//can I overload main method??
	//yes, you can overload main method
	public static void main(String a) {
		System.out.println(a);
	}
	public static void main(int b, int g) {
		//local variable cannot be static 
		//static int b = 20;
		System.out.println(a); //0
		System.out.println(b);
		System.out.println(g);
	}
	//overloading with different parameter 
	public static void main(double c, char w) {
		//local variable cannot be static 
		//static int b = 20;
		System.out.println(c);
		System.out.println(a);
		System.out.println(w);
	}
	public static void vidya() {
		int b = 200;
		//here one variable a is local variable and other one has name conflict so i resolved it by class name  
		int sum = a + StaticBlockDemo2.a;
	}
	
	
	public static void main(String[] args) {
		//global variable which is static 
		//static method with one parameter of type int 
		main(10, 222);
		//static method with one parameter of type double 
		main(122.0893, 'W');
		vidya();
		main("vidya");
	}
}