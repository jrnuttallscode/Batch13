// Using string take an input 123456789 and print a output as 102030405060708090

import java.lang.*; 
// package com.program;

public class StringInputOutput {

//	public static void main(String[] args) {
//		String[] a = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//		if ( int i = 0; i <= 8; i++)
//			System.out.println(i + "0");


//Java program to insert a string into another string 
//without using any pre-defined method 


 public static String insertString( 
     String originalString, 
     String stringToBeInserted, 
     int index) 
 { 

     StringBuffer newString 
         = new StringBuffer(originalString); 

     newString.insert(index + 1, stringToBeInserted); 

     return newString.toString(); 
 } 

 public static void main(String[] args) 
 { 

     String originalString = "123456789"; 
     String stringToBeInserted = "0"; 
     int index1 = 1;
     int index2 = 2;
     int index3 = 3;
     int index4 = 4;
     int index5 = 5;
     int index6 = 6;
     int index7 = 7;
     int index8 = 8;
     int index9 = 9;

     System.out.println("Original String: "
                        + originalString); 
     System.out.println("String to be inserted: "
                        + stringToBeInserted); 
     System.out.println("String to be inserted at index: "
                        + index1); 

     // Insert the String 
     System.out.println("Modified String: "
                        + insertString(originalString, 
                                       stringToBeInserted, 
                                       index1)); 
 } 
} 