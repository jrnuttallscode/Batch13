package com.program;

public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40};
		int a = 10; 
		int b = 0;
		int c = 0;

		try 
		{
			System.out.println("c = " + c);
			try 
			{
				System.out.println(arr[4]);
			}
			catch(Exception e)
			{
				System.out.println("Index incorrect");
			}
			c = a / b;

			/*}catch(Exception e) 
			 * {
			 * This catch block is unreachable (Exception is parent class of the others)
			 * System.out.println("Exception Occurred");
			 */
		}
		catch(ArrayIndexOutOfBoundsException r) 
		{
			System.out.println("Index incorrect");
		} 
		catch(Exception e) 
		{
			System.out.println("Exception");	
		} 
		finally 
		{
			System.out.println("Finally");
		}
	}
}