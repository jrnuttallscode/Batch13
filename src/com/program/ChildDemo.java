package com.program;
//parent is called super class of child
class ParentDemo{
	int accno = 1234567;
	String name = "Josh Nuttall";
	double amount = 987654321;
	
	public ParentDemo() {
		
	}
	
	public ParentDemo(int accno, String name, double amount) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		
	} 
	
	public void display() {
		System.out.println(this.accno + "\n" 
				+ this.name + "\n" + this.amount);
	}
	
}

//child is subclass of parent
public class ChildDemo extends ParentDemo{
	double balance;
	
	public ChildDemo (double balance) { 
		this.balance = balance;
	}
	
	public void savings(double amount) {
		this.balance += amount;
		System.out.println(this.balance);
		
	}
	@Override
	//override is a concept of having exact match of method name and parameters 
	//in the child class and don't care about the logic inside it 
	//@ Override is annotation which is going to strictly check for the signature of method
	//super is the keyword which is used to call the variable from the parents class
	public void display() {
		System.out.println(super.accno + "\n" 
				+ super.name + "\n" + super.amount + this.balance);
		
	}

	public static void main(String[] args) {
		ChildDemo c = new ChildDemo(1233.33);
		//access all the child variable and 
		System.out.println(c.balance); //1233.33
		c.savings(122);
		
		//accessing parents all instance variable and method
		System.out.println(c.accno);
		System.out.println(c.name);
		System.out.println(c.amount);
		c.display();
			
		ParentDemo d = new ParentDemo();
		//access only parents method and variable\
		System.out.println(d.accno);
		System.out.println(d.name);
		System.out.println(d.amount);
		d.display();
		
		//parent cannot access the method and variable defined in child class
		//trying to access child methods and variable
		//d.savings(3333);
		
		//creating child object referencing parent 
		ParentDemo something = new ChildDemo(2333);
			//child methods are not accessible 
			//only parents methods and variable are
			//System.out.println(something.balance); //1233.33
			//something.savings(122);
				
			//accessing parents all instance variable and method
			System.out.println(something.accno);
			System.out.println(something.name);
			System.out.println(something.amount);
			//display is not from the parent but from the child
			//overrides the parent classes display 
			something.display();
			
		//ChildDemo somethingElse = (ChildDemo) new ParentDemo();
		

	}

}