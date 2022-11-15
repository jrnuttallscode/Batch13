package com.program;

public class EveryOtherTwo {

	public static void main(String[] args) {

		//initialize array
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

		//array length
		int n = arr.length;

		// loop through the array and increment by 2
		for(int i = 0; i < n; i = i + 4)
		{
			//print element
			System.out.println(arr[i] + " " + (arr[i] + 1));
		}
	}
}
