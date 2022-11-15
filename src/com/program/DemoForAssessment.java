//Create a Interface with name Demo and have some variable "name" with of type String and also 
//another variable with id of type int  and methods print and display implementation should 
//be done 2 ways one using a entirely new class and another without using a class.


package com.program;

public interface DemoForAssessment {

	String name = "Josh";
	int number = 1;
	
	void print();
	void display();
	
}
 class Monitor implements DemoForAssessment {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	 
 }