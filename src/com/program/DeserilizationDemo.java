package com.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("josh.txt");
		
		//bytestream is converted into a Object
		ObjectInputStream obj = new ObjectInputStream(file);
		
		Student object = (Student) obj.readObject();
		System.out.println(object.toString());
	}

}