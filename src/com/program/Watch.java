package com.program;

public interface Watch {
	void tiking();
	void stopWatch();
	// Adding default keyword in an interface: 
	// I can also have an implementation of a method in interface.
	// How many default methods you can have in a interface???
	// You can have as many default methods as you need.
	// Which ever class wants this method can call it, 
	// and which ever class doesn't need it can ignore it.
	default void alarm() {
		System.out.println("set up alarm time ");
	}
	
	default void worldClock() {
		System.out.println("display world timing");
	}
	
	// I can have more method implementations that use the static keyword,
	// but I cannot have the method override. 
	// If I want to call this method I use the interface name to call it. 
	// How many static methods can I have in this interface?
	// Any number of methods as needed.
	// All methods will be called by the class name. 
	static void doSomething() {
		System.out.println("static method is called");
		System.out.println("inside the Watch interface ");
	}	
}