package com.program;

import java.sql.SQLException;
import java.util.Scanner;



public class ThrowAndThrowsDemo {
	//throws is a keyword which can only be called on method declaration
	//only checked and customized exceptions can be thrown using the keyword throws
	public void throwDemo() throws CustomizeException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary of the employee: ");
		int salary = s.nextInt();
		if(salary < 2000) {
			//throw can work with checked, unchecked and customized exception
			throw new CustomizeException();
		}

	}

	public static void main(String[] args) throws CustomizeException, SQLException{
		//throw is a keyword which is used to throw the object
		//of exception
		//can be runtime, compiletime and customized exception
		//try and catch and finally go in main method
		//throw goes for both main and other methods
		//even if there is chance of having an exception you can use throw keyword
		//to throw an exception
		ThrowAndThrowsDemo d = new ThrowAndThrowsDemo();
		d.throwDemo();

	}
}

class child {
	//its a overriding method
	//and its not mandatory to have this method along with the exception of parent
	//Why because my child method might have some extra feature which might not need this exception
	//this can have same exception as the parent or have a subclass of the exception defined in the parent
	//with interface its mandatory to have the throws on the method which is in implementing class
	//because that is where actual logic comes from
	public void throwDemo() {
	}
}