package com.program;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str = "This will read backwards.";
		StringBuilder b =  new StringBuilder();
		b.append(str);
		System.out.println(b.reverse());
	}

}
