// Arrays 1-D and 2-d array and return type, passing parameter, 
// String class, and also package(how and why to use package)


package com.program;

public class ArrayClassQuestion {

	public static void main(String[] args) {

		array1D();
		
		
		
	}

	public static void array1D() {
		
		int[] alpha = {45, 2003, 99, 564, 45, 9888};
		
		int[] beta = {669, 123, 784, 369, 159, 440, 855, 456985, 36225, 458712};
		
		int a = alpha[4];
		
		int b = beta[1];
		
		int c = alpha[4] * beta[1];
		
		System.out.println(alpha.length);
		
		System.out.println(beta.length);
		
		System.out.println(a + b);
		
		System.out.println(c);
		
		System.out.println(alpha.length + beta.length);
	}
	
//	public static void array2D() {
//		
//		int[][] alpha = {{45, 2003}, {564, 45}, {895, 2547}};
//		
//		int[][] beta = {{669, 123}, {369, 159}, {2155, 6587}};
//		
//		int a = alpha[0];
//		
//		int b = beta[1];
//		
//		int c = alpha[4] * beta[1];
//		
//		System.out.println(alpha.length);
//		
//		System.out.println(beta.length);
//		
//		System.out.println(a + b);
//		
//		System.out.println(c);
//		
//		System.out.println(alpha.length + beta.length);
//	}
}
