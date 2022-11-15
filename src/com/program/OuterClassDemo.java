package com.program;
//can i have class as static??
//no i cannot have a class as static but yes i can have inner class 
//static
//Inner class or nested class: defining a class inside another class block 
public class OuterClassDemo {
	int a = 12300;
	//i have 2 types of inner class
	//1 is static inner class called as nested class
	//2 is regular inner class called as inner class
	//it cannot have public access modifier
	//any number of static and regular inner class can be 
	//defined inside a class
	static class StaticNestedClass {
		int a = 2231;
		//rest of the logic will be same as other class
		//functionality can be all defined in it 
		//any number of variable and methods can go in 
		
		public void add() {
			System.out.println("I'm inside the StaticNested class.");
		}
	}
	
	//i can have any number of regular classes inside a class
	class InnerClass {
		//instance variable defined in the 
		int a = 1231;
		//functionality wise you can have anything
		//any no.of method can be defined
		public void sub() {
			System.out.println("I'm inside the InnerClass.");
		}
	}
	
	//this method is going to have a class inside it 
	//and that class is going act like a local variable wherein you cannot access it from outside
	public void localInnerClassMethod(){
		class InnerMethodClass{
			//all the functionality is going to be same and can have any number of methods
			public void getDisplay() {
				System.out.println("dhsbfywgfjkdhgfuy");
			}
		}
		InnerMethodClass s = new InnerMethodClass();
		s.getDisplay();
	}
	
	
	public static void main(String[] args) {
		//execution starts from main method
		OuterClassDemo o = new OuterClassDemo();
		System.out.println(o.a); //12300
		//as we know we refer to static by class name 
		//we should refer to static inner class also in the same way
		OuterClassDemo.StaticNestedClass o1 = new StaticNestedClass();
		//instance method is being reference by object of the inner class
		System.out.println(o1.a); //2231
		o1.add();
		
		
		//regular class being called in the OuterClass main method
		OuterClassDemo.InnerClass a = o.new InnerClass();
		System.out.println(a.a); //1231
		
		//calling the InnerMethodClass which is defined inside a method
		o.localInnerClassMethod();
		
		//We cannot instantiate a interface 
		//here we are not violating the rule of object instantiating cannot be done for interface
		//we are just adding the anonymous class at the end of the parentheses and semicolon
		//very often used in the collections for the implementation of interface which doesn't need 
		//an entire new class but this way its very less coding 
		AnonymousDemo obj = new AnonymousDemo() {

			//its just all the methods in the interface which I'm implementing 
			//in this anonymous class
			//using this object you can call all the methods
			@Override
			public void display() {
				System.out.println("Hello");
				
			}

			@Override
			public void print() {
				System.out.println("World");
				
			}
		};
		
		obj.display();
		obj.print();
		
	}

}

class OuterClassSubDemo {
	
}