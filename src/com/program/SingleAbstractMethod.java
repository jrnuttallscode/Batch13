package com.program;
// having this annotation is going to strictly check for having only one 
// abstract method in the interface
// function interface is a interface which can have one abstract method
// Multiple default and static method and any number of object class methods
// as abstract method

@FunctionalInterface
public interface SingleAbstractMethod {
	//single abstract method
	void print();
	
	//any number of default method
	default void display () {
		
	}
	
	//any number of static method
	static void demo() {
		
	}
	
	//object class method which can be abstract 
	int hashCode();
	String toString();
	boolean equals(Object obj);
	
}