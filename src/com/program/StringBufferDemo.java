package com.program;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str = "Josh Nuttall";
		StringBuffer b =  new StringBuffer();
		b.append(str);
		System.out.println(b.reverse());
	}

}
