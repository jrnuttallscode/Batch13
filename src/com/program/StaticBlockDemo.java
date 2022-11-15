package com.program;

public class StaticBlockDemo {
	//JVM is capable of loading it before main method so it's just used for some initialization; 
	//not much of the logic is included.
	//This block cannot refer anything from outside. 
	static{
		int a = 2000;
		double x = 125.59;
		char y = 'R';
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);

		
	}
	
	//static variable
	static int a;
	
	//can i overload main method??
	//yes you can overload main method
	public static void main(int a) {
		//local variable cannot be static 
		//static int b = 20;
		System.out.println(a);
	}
	//overloading with different parameter 
	public static void main(double a) {
		//local variable cannot be static 
		//static int b = 20;
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(a);
		main(10);
		main(122.0893);

	}

}