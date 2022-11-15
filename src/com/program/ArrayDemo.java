package com.program;

public class ArrayDemo {

	public static void main(String[] args) {

		 //combination of sequence of numbers which is

		 //going to have continuous memory allocation

		 //size of array is fixed

		 //array indexing starts from 0 to (size - 1)

		 

		 //Create an array

		 int[] vidya = {17343,2432423,34234,4343,5434,6324,435,646,3456,35463,346536,34534,35345,34535}; //6

		 //0 to 5  same as 1 to 6

		 

		 //retrieve one element

		int a = vidya[2];

		int b = vidya[3];

		 //int c = vidya[6]; //index out of bound exception you can access only values

		 //till 5 not 6

		 int c = vidya[2] + vidya[3];

		 System.out.println(vidya.length);

		 

		 //Retrieving each and every element and multiply it with some value

		// for(int i = 0; i <= vidya.length-1; i++) {

		// System.out.println(vidya[i] * 10);

		// }

		 

		 //Update

		 vidya[2] = 11;

		// for(int i = 0; i <= vidya.length-1; i++) {

		// System.out.println(vidya[i]);

		// }

		 

		 //delete

		 vidya[2] = 0;

		 for(int i = 0; i <= vidya.length-1; i++) {

		 System.out.println(vidya[i]);

		}

		}
	}

