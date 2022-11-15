package com.program;

//when a class implements a interface it is forced to implement all the
//abstract methods of the interface 
public class ImplementationClass implements InterfaceDemo {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
	public void print() {
		
	}
	
	public static void display() {
		
	}
	public static void main(String[] args) {
		ImplementationClass d = new ImplementationClass();
		d.add();
		d.sub();
		d.print();
		display();
		//InterfaceDemo d2 = new InterfaceDemo(); // instantiating an object of interface 
		
		InterfaceDemo d1 = new ImplementationClass();
		d1.add();
		d1.sub();
		//d1 is not able to access the print method

	}

	

}