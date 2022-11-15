package com.program;

public class MultiDArray {

	public static void main(String[] args) {
		//multiDimensional Array

		 //create it with value

		 int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};

		 

		 //Without the values

		 int[][] arr1 = new int[2][2];

		 //assigning the values

		 arr1[0][0] = 20;

		 arr1[0][1] = 40;

		 arr1[1][0] = 60;

		 arr1[1][1] = 80;

		 

		 //Retrieving

		 //if you know the index its going to be o(1)

		 int z = arr1[1][0]; //60

		 

		//how can you retrieve all the elements

		for(int i = 0 ;i < arr.length; i++) {

		for(int j = 0; j < arr.length; j++) {

		 //i is row and j is column

		 System.out.println(arr[i][j] * 22);
		}

		 

		}

		 

		 //update

		 arr1[1][1] = 100028376;

		for(int i = 0 ;i < arr1.length; i++) {

		for(int j = 0; j < arr1.length; j++) {

		 //i is row and j is column

		 System.out.println(arr1[i][j] );

		}

		 

		}

		 

		 //delete

		 //replace the value with a 0 as array size cannot be increased or decreased

		 arr1[1][1] = 0;

		for(int i = 0 ;i < arr1.length; i++) {

		for(int j = 0; j < arr1.length; j++) {

		 //i is row and j is column

		 System.out.println(arr1[i][j] * 12);

		}

		 

		}
	}

}
