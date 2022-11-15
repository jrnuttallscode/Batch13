//create a class with name OverridingDemo and have 3 methods 
//1. add method 
//2. subtract method 
//3. divide method 
//and have another childOverridingDemo and have 2 method one overriding 
//from OverridingDemo and other with name multiply and have a main method.  
//1. create a object and child referencing child and call methods of both
//2. create a object of parent and call all the method of both 
//3. create a object of child referencing the parent and call all the methods


package com.program;

class Parent1 {
	
	public void add() {
		System.out.println("Add in Parent.");
	}
	
	public void subtract() {
		System.out.println("Subtract in Parent.");

	}
	public void divide() {
		System.out.println("Divide in Parent.");

	}
}
	public class OverridingDemo extends Parent1 {
		
		@Override
		public void add() {
			System.out.println("Add in Child.");
			
		}
		
		public void multiply() { 
			System.out.println("Multiply in Child.");

		}
		

	public static void main(String[] args) {
		OverridingDemo d = new OverridingDemo();
		d.add();
		d.subtract();
		d.multiply();
		d.divide();
		
		
		Parent1 p = new OverridingDemo();
		p.add();
		p.subtract();
		p.divide();
		//p.multiply(); parent object trying to call the child method
		
		Parent1 a = new Parent1();
		a.add();
		a.subtract();
		a.divide();
		// a.multiply(); parent object trying to call the child method
		

	}

}

