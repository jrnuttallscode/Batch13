package com.program;

//never ever make a class name with the name of inbuilt class in java
//like static, String, Arrays so on
//What is a string
//its a non primitive datatype
//its a class in java which is in java.lang package
//its a combination of char primitive datatype
//if you want to have sequence of characters then you use the char[]

public class StringDemo {

	public static void main(String[] args) {

		//as its a class you must create a object
		int a = 213;
		String str = "helloWorld";
		char r = str.charAt(5); //W

		//compiler is going to convert it into an object creation
		//String str = new String("helloWorld");
		StringDemo d  = new StringDemo();
		char[] ch = {'h','e','l','l','o','3','B'};
		int [] arr = {10,2,35,5,6,3};
		boolean[] arr1 = {false,true,false,true};
		double [] darr= {12,34,2343.24,2434,22.23444};
		String[] sarr = {"dfe","34","fef","efef423_dehf"};

		//s is a object of string class
		String s = new String(ch);

		//its a instance method so use the object
		char v = s.charAt(5);//3 //0 to 5 where in size is 6
		int value = s.codePointAt(6);//65
		int value1 = s.codePointAt(1);//65
		int value2 = s.codePointAt(2);//65
		int value3 = s.codePointAt(3);//65
		System.out.println(value);//
		System.out.println(value1);//
		System.out.println(value2);//
		System.out.println(value3);//
		int value4 = s.codePointCount(0,4);
		System.out.println(value4);
		System.out.println(str.compareTo(s)); // positive, 0 or negative value
		System.out.println(s.compareTo(str));
		
		// 10/11/2022
		
		
	}
}