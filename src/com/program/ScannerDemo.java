package com.program;

import java.util.Scanner;

public class ScannerDemo 
{

	public static void main(String[] args) 
	{
		
		int empId;
		String empName;
		double empSal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Employee ID: ");
		empId = sc.nextInt();
		
		System.out.println("Enter your name: ");
		empName = sc.next();
		
		System.out.println("Enter employee salary: ");
		empSal = sc.nextDouble();
		
		System.out.println("---------------------------------------");
		
		System.out.println(empId + "\n" + empName + "\n" + empSal);
	}
}
