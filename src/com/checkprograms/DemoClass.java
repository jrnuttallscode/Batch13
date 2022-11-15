package com.checkprograms;

public class DemoClass {

	public static void main(String[] args) throws Throwable {
		DemoClass d = new DemoClass();
		DemoClass d1 = new DemoClass();
		//finalize
		//its a method in Object class which is used for the garbage collection 
		//its going to empty out the memory allocated by the object
		//but when you print the object you will get the start memory location 
		//stack is still holding the reference 
		//heap memory will be cleared by this method
		d.finalize();
		
		//convert this object into a string 
		System.out.println(d.toString());
		
		//equals method is going check one object with another
		//false as each and every object is 
		//different and have a different hashcode
		//singleton object which is a design patter having same object created all the time
		boolean b = d.equals(d1);
		System.out.println(b); 
		
		//get the fully qualified class name  
		System.out.println(d.getClass());
		
//		//hashcode : which takes address runs some algorithm on it and produce a int value
//		int hashcodeValue = d.hashCode();
//		System.out.println(hashcodeValue);//2060468723 always same 

//DemoClass[] arr = {new DemoClass(),  new DemoClass(),new DemoClass(),new DemoClass()}; //size 4
//		
//		DemoClass[] arr1 = new DemoClass[7];
//		System.arraycopy(arr, 0, arr1, 1, 4);
//		for(int i = 0 ; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		//System.exit(int) when ever program encounters this line of code 
//		//it just terminate the flow 
//		//System.exit(0);
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		System.out.println("jhwebdugyaweftewuygdhkvaweitufydgkhvqeufkgjhqvgiufkgj");
//		
//		//System.gc();
//		//again garbage collector which is executed
//		//and its for entire program if there are any unused object everything will be cleared
//		System.gc();
		
	}

}