// 1.how to remove all the occurrence of a character in a given string??
// 2.How to reverse a string ?


package com.program;

public class StringProblems {

	static void removeChar(String s, char c) {
		
		int j, 
		count = 0, 
		n = s.length();
		
		char[] t = s.toCharArray();
		for (int i = j = 0; i < n; i++) {
			
			if (t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}

		while(count > 0) {
			
			t[j++] = '\0';
			count--;
		}

		System.out.println(t);
	}

	public static void main(String[] args) { 
		
		String s = "geeksforgeeks";
		removeChar(s, 'g');
		removeChar(s, 'e');
	}
}


//package com.program;
//
//public class StringProblems {
//
//	static int reverse(int n) {
//		
//		int rev = 0;
//		int rem;
//		
//		while (n > 0) {
//			
//			rem = n % 10;
//			rev = (rev * 10) + rem;
//			n = n / 10;
//		}
//		
//		return rev;
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		int n = 654897;
//		
//		System.out.println("Original number is " + n);
//		System.out.println("Reversed number is " + reverse(n));
//		
//	}
//
//}