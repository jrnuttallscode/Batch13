package com.program;

//Dynamic or runtime polymorphism is method overriding 
//static or compile time polymorphism is method overloading and method hiding (overriding static method)
//As i said runtime polymorphism is a concept of overriding 
//override is a concept of inheritance 
//having same method signature in the child which is same as parents

class Parent {
	public void add() {
		
	}
	
	public Object add() {
		System.out.println("I'm in the Parent class.");
		Object o = new Object();
		return o;
	}
	
}

public class RuntimePolymorphismDemo extends Parent{
	//this annotation is used to strictly check for signature
	@Override
	public void add() {
		
	}

	public static void main(String[] args) {
		RuntimePolymorphismDemo d = new RuntimePolymorphismDemo();
		//which method to call 
		//is it from parent or child will be decided at runtime
		//thats the reason its called dynamic or runtime polymorphism
		d.add();
		
		//object of child referencing the parent 
		//this object p is capable of accessing all member of parent 
		//and the overrided method in the child class
		Parent p = new RuntimePolymorphismDemo();
		//child method will be called but it will be decided during runtime
		//Method Hiding is a concept of having a static method being override in the child class
		//it cannot have the annotation override but the child method will be called always
		//its a kind of static polymorphism 
		//always the child static method is executed
			print();
		p.add();

	}

}