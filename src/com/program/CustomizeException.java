package com.program;

//is my customized exception which I don't know a compile time or runtime so i 
//make this class as a child of exception
public class CustomizeException extends Exception{
	public CustomizeException() {
		System.out.println("Salary entered is less than expected range for an Employee");
	}
}
