//Write a class with the name Wall. The class needs two fields (instance variables) with name 
//width and height of type double.
//The class needs to have two constructors. The first constructor does not have any parameters 
//(no-arg constructor). The second constructor has parameters width and height of type double 
//and it needs to initialize the fields. In case the width is less than 0 it needs to set the 
//width field value to 0, in case the height parameter is less than 0 it needs to set the height 
//field value to 0.
//Write the following methods (instance methods):
//* Method named getWidth without any parameters, it needs to return the value of width field.
//* Method named getHeight without any parameters, it needs to return the value of height field.
//* Method named setWidth with one parameter of type double, it needs to set the value of the 
//width field. If the parameter is less than 0 it needs to set the width field value to 0.
//* Method named setHeight with one parameter of type double, it needs to set the value of 
//the height field. If the parameter is less than 0 it needs to set the height field value to 0.
//* Method named getArea without any parameters, it needs to return the area of the wall.
//
//TEST EXAMPLE
//→ TEST CODE:
//1 Wall wall = new Wall(5,4);
//2 System.out.println("area= " + wall.getArea());
//3 
//4 wall.setHeight(-1.5);
//5 System.out.println("width= " + wall.getWidth());
//6 System.out.println("height= " + wall.getHeight());
//7 System.out.println("area= " + wall.getArea());
//
//→ OUTPUT:
//
//area= 20.0
//width= 5.0
//height= 0.0
//area= 0.0

package com.program;

public class Wall {

	public double width;
	public double height;

	public Wall() {

	}
	public Wall(double width, double height) {
		this.width = width;
		this.height = height;	
	}

	public double getWidth() {
		if(width <= 0) {
			this.width = 0;
		} else {
			this.width = width;
		} 

		return this.width;
	}

	public double setWidth(double width) {
		this.width = width;
		if(width <= 0) {
			this.width = 0;
		} else {
			this.width = width;
		} 
		return this.width;
	}

	public double getHeight() {
		if(height <= 0) {
			this.height = 0;
		} else {
			this.height = height;
		}

		return this.height;
	}

	public double setHeight(double height) {
		this.height = height;
		if(height <= 0) {
			this.height = 0;
		} else {
			this.height = height;
		}

		return this.height;
	} 

	public double getArea() {
		return (width * height);
	}



	public static void main(String[] args) {
		
		Wall wallA = new Wall();
		Wall wallB = new Wall();
		Wall wallC = new Wall(5,4);

		System.out.println("area= " + wallC.getArea());
		wallC.setHeight(-1.5);
		System.out.println("width= " + wallC.getWidth());
		System.out.println("height= " + wallC.getHeight());
		System.out.println("area= " + wallC.getArea());
	}

}




















