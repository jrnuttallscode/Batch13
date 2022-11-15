package com.program;

public class NestedTryCatch {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = 0;

		int arr[] = {10,20,30,40};

		try
		{
			try
			{
				System.out.println(arr[4]);
			}
			catch(ArrayIndexOutOfBoundsException sc)
			{
				System.out.println("Index incorrect");
			}
			c = a / b;
		}
		catch(ArithmeticException aee)
		{
			System.out.println("Cannot divide by zero.");
		}
		finally
		{
			System.out.println("c = " + c);
		}
	}
}
