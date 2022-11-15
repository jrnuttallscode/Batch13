package com.program;

public class IntegerDemo {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE); //int 2^31 -1
		System.out.println(Integer.MIN_VALUE); //- 2 ^32
		System.out.println( "its 32 bits" + Integer.SIZE);
		System.out.println(Integer.TYPE);

		String s = "beww"; //String s = new String("beww");
		int a = 12;
		Integer i = -131;
		Integer i1 = new Integer("1233"); //it has to be numeric String

		int d = Integer.bitCount(39);
		//count the number of one's in the binary representation of parameter
		//00000000 00000000 00000000 00100111
		System.out.println("bitcount result"+d);


		//byte max is -128 to 127
		//shift operator is doing a left shift
		//01111111
		//11111110
		byte e = i.byteValue();
		System.out.println("byteValue" + e);

		//compare is going compare 2 value give you
		//+1 or negative 1 or 0 if first is greater and both equal and first is smaller
		int a1 = Integer.compare(20, 10);
		System.out.println("compare method is called" + a1);

		//Decodes a String into an Integer.
		//either use a constructor or use this method
		Integer i2 = Integer.decode("2434");
		System.out.println("Decode method " + i2);

		//its giving you -1, 0 an 1 for negative, 0 and positive
		int f = Integer.signum(220);
		System.out.println(f);

		System.out.println(Integer.toBinaryString(15));// 1111
		System.out.println(Integer.toHexString(15));//F
		System.out.println(Integer.toOctalString(15));//17

		// Integer getInteger(String nm, int val)
		//its just giving me value whatever i have entered
		//if nothing is entered as a parameter its null
		//this method is overloaded
		Integer i3 = Integer.getInteger("");
		Integer i4 = Integer.getInteger("", 211 );
		Integer i5 = Integer.getInteger("", i2 );
		System.out.println("value returned by getInteger method"+ i3);

		//Returns an int value with at most a single one-bit, in the position of the 
		//highest-order ("leftmost") one-bit in the specified int value.
		//00000000 00000000 00000000 00001010
		int g = Integer.highestOneBit(10);
		System.out.println("highest onebit" +g);

		//convert it into binary and 2's complement is applied on this
		//00000000 00000000 00000000 10000000
		//11111111 11111111 1111111 01111111
		int h = Integer.reverse(128);
		System.out.println("reverse value" + h);

		System.out.println(Double.MAX_VALUE);//2^63-1
		System.out.println(Double.MIN_VALUE);//- 2^64
		
		Integer d1 = 1944;
		float x = d1.floatValue();
		System.out.println("Return of floatValue " + x);
		
		int a12 = 100;
		//converting a primitive into an object is
		//is called as autoboxing
		Integer d1 = a12;
		
		//object to primitive is called unboxing
		int a13 = d1; //directly do it
		int a14 = d1.intValue(); // using a method in Integer class
		int a15 = d1.parseInt("12312");//how about if its a numeric string
		
		

	}
}