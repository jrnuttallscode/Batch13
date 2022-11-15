// Create a program with method with nSum(int n) returns the sum of all numbers from 0 to n. 
// The first 10 numbers are: 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.

package com.program;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		int n = 10; 
		
	    for (int i = 1, a = 0; i <= n; i++, a++) {
	    	sum = sum + a;
	      System.out.println(i);
	    }
	  }

}
