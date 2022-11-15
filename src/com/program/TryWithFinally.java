package com.program;

public class TryWithFinally {

	public static void main(String[] args)  
		{
		int arr[]= {10,20,30,40};
			try
			{
				System.out.println(arr[3]);
			}
			finally
			{
			System.out.println(arr[1]);
		}
	}
}

