// The Swimming Company has asked you to write an application that calculates 
// the volume of cuboid shaped pools.
//
// 1. Write a class with the name Rectangle. The class needs two fields 
// (instance variable) with name width and length both of type double.
//
// The class needs to have one constructor with parameters width and 
// length both of type double and it needs to initialize the fields.
//
// In case the width parameter is less than 0 it needs to set the width field value to 0.
//
// In case the length parameter is less than 0 it needs to set the length field value to 0.
//
// Write the following methods (instance methods):
//
// * Method named getWidth without any parameters, it needs to return the value of width field.
// * Method named getLength without any parameters, it needs to return the value of length field.
// * Method named getArea without any parameters, it needs to return the calculated area 
// (width * length).


package com.program;

public class Rectangle  {

	double width = 12.3;
	double length = 1250.9;
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println(r.getWidth());
		System.out.println(r.getLength());
		System.out.println(r.getArea());
		
	}
	
	public double getWidth() {
	
		return width;
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double getArea() {
		if (width < 0)
			width = 0;
		if(length < 0)
			length = 0;
		double area = width * length;
		return area;
	}
} 
