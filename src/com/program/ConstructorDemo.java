package com.program;

public class ConstructorDemo {
	
	int a = 10;
	int b;
	String c ;
	
	//constructor is a special method that has no return type and same name as class
	//constructor as it has same name if you want to write more constructor
	//then you should have different no.of parameters
	//Constructor chaining: 
	//linking one constructor to another by using this();
	//and main method is going to have only one or more constructor calls but 
	//internally they are going to call more no.of parameterized constructors
	
	public ConstructorDemo() {
		this(10);
	}
	
	//as its is internal call this can be private access modifier 
	//if its private you can never pass parameter and call this constructor from any other class its only 
	//specific for this class
	private ConstructorDemo(int a, int b, String c ) {
		this.a  = a;
		this.b = b;
		this.c = c;
	}
	private ConstructorDemo( int b, String c, int a ) {
		this.a  = a;
		this.b = b;
		this.c = c;
	}
	public ConstructorDemo(int a) {
		this(a,234,"hydg");
		
	}
	
	public ConstructorDemo(int a, String b) {
		this(a,234,"hydg");
		
	}
	
	public ConstructorDemo(String b , int a ) {
		this(a,b, 67);
	}
	
	
	public static void add() {
		int a = 0;
	}
	
	public static void add1 (int a, int b, int c, int d, int e ) {
		a = 45;
		b = 67;
		c = 34;
		d = 89;
		e = (a + b + c + d);
	}
	

	public static void main(String[] args) {
		ConstructorDemo e = new ConstructorDemo();
		ConstructorDemo d1 = new ConstructorDemo(657, "fgft");
		
		
		add();
		add1(12);
		
		System.out.println(e);
	}

}