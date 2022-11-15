package com.program;

//never ever make a class name with the name of inbuilt class in java
//like static, String, Arrays so on
//What is a string
//its a non primitive datatype
//its a class in java which is in java.lang package
//its a combination of char primitive datatype
//if you want to have sequence of characters then you use the char[]

public class StringDemo2 {
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

		char[] charr = {'v','i','d','y','a'};
		String st1 = String.copyValueOf(charr);
		System.out.println(st1);

		char[] charr1 = {'v','i','d','y','a','@','b','i','n','a','r','y'};
		String st2 = String.copyValueOf(charr1, 5, 7);
		System.out.println(st2);
		//
		String a1 = "hellofycfhgxtygcdyrufcjhtchrd";
		// int ch1 = a1.codePointAt(0);
		// System.out.println(ch1);
		int num = a1.indexOf(101);
		System.out.println(num);
		int num1 = a1.indexOf(99,6);
		System.out.println(num1);
		System.out.println("a1 hashcode "+a1.hashCode());
		String a2 = a1 + a1;//at the end
		System.out.println("a2 hashcode "+a2.hashCode());
		System.out.println(a2);

		byte[] barr = a1.getBytes();
		for(int i = 0; i < barr.length;i++) {
			System.out.println(barr[i]);
		}

		char[] copy = new char[10];
		a1.getChars(5,13, copy,2 );
		for(int i = 0; i < copy.length;i++) {
			System.out.println(copy[i]);
		}

		String str0 = "olleh";
		String strz = str0.intern();
		System.out.println(strz);
		String stz1 = "helloworld";
		for(int i = 0; i < stz1.length();i++) {
			System.out.println(stz1.charAt(i) + " cat");
		}
		boolean t = stz1.matches("@");
		System.out.println(t);

		//replace all occurrence of l with a
		String stz2 =stz1.replace('l', 'a');
		System.out.println(stz2);
		String stz3 = stz1.replaceFirst("[a-e]", "1");
		System.out.println(stz3);
		String email = "dt.vidayshree.gmail.com";
		String[] name = email.split("\\.", 2);
		for(int i = 0; i < name.length;i++) {
			System.out.println(name[i]);
		}

		double anumber =1342342.65585;
		String snumber = String.valueOf(anumber);
		String[] numberarr = snumber.split("\\.");
		for(int i = 0; i < numberarr.length;i++) {
			System.out.println(numberarr[i]);
		}
	}
}