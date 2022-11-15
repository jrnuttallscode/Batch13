package com.checkprograms;

public class ExceptionHandlingDemo 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 5, c = 0;
		try 
		{
			c = a / b;
	    } 
		// No other statements are allowed between try/catch 
		//System.out.println("Hi.");
		catch(ArithmeticException e) 
		{
		System.out.println("You cannot divide a number by zero.");
		}
		finally 
		{
		System.out.println("c = " + c);
		}
	}
}
