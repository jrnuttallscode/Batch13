package com.program;

public class MainDemo {

	public static void main(String[] args) {
		SingleAbstractMethod d = () -> {
			System.out.println("I'm implemented using lambda");
		};
		//this is SAM which i implemented using lambda
		d.print();
		//this is default method
		d.display();
		//this is object class method
		d.hashCode();
		//this is a static method which is called using interface name
		SingleAbstractMethod.demo();

	}

}