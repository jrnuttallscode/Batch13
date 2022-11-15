package com.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput 
{
	public static void main(String[] args) throws IOException
	{
		int empId;
		String empName;
		double empSal;

		//Scanner sc = new Scanner(System.in);
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(inputStreamReader);

		System.out.println("Enter employee id: ");
		empId=Integer.parseInt(reader.readLine());

		System.out.println("Enter employee name: ");
		empName=reader.readLine();

		System.out.println("Enter employee salary: ");
		empSal=Double.parseDouble(reader.readLine());

		System.out.println("----------------------------------------");

		System.out.println(empId + "\n" + empName + "\n" + empSal);	
	}
}
