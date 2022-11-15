package com.program;
//this class is not haveing any modifier
		//so this is called package private access modifier 
		//or no access modifier
		//if a class is package private
class Demo {
	
	public int v = 21312;

	public static void main(String[] args) {
		AccessModifierDemo1 obj = new AccessModifierDemo1();
		//they are no access modifier variabel which can be accessiable
		obj.a = 10;
		obj.b = 12;
		
		//these variable cannot be accessed outsidfe the class 
		//they are specifie to that particular class where they are defined
		obj.c = 100;
		obj.d = 123;
		//these are public variable
		
		obj.e = 2324;
		
		//they are no access modifier variabel which can be accessiable
		obj.add();
		//these variable cannot be accessed outsidfe the class 
		//they are specifie to that particular class where they are defined
		obj.subtract();
		
	}

}