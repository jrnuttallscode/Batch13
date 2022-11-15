//how to make a class immutable 
//by having class and method and fields as final and also 
//not having setter methods

//Why to make a class immutable 
//I don't want to change the value or the method logic of this class


package com.program;

//immutable class
//you cannot change which mean class cannot be inherited, 
//method cannot be override and variable cannot value cannot be changed
//example of immutable class: String class is immutable class 
//making a class immutable you cannot have setter methods




//if a class is final then i cannot inherit it 
//it cannot have child 
public final class FinalDemo {
	//instance variable
	//final is called as non access modifier
	//once a variable is declared as final its value cannot be changed
	//and mostly global variables are declared as final not the local
	//the final variable name should be all upper case
	//all variable has to be initialized with a value
	//PI is 3.142...
	final int NUM = 90;
	
	final double PI = 3.142;
	private int a = 20; 
	int b;
	
	//final keyword in method 
	//if a method is declare with a final keyword then that 
	//method cannot be overridden in any subclass
	//this method is going to work as usual with respect to calling 
	//using a object 
	public final void add() {
		
		int sum = this.NUM+ this.NUM;
	}

	public static void main(String[] args) {
		FinalDemo d = new FinalDemo();
		d.add();

	}

}

//class Child extends FinalDemo{
//	@Override
//	public final void add() {
//		
//	}
//}