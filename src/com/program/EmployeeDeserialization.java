package com.program;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("employee.txt");
		
		ObjectInputStream obj = new ObjectInputStream(file);
		
		Employee object = (Employee) obj.readObject();
		System.out.println(object.toString());
	}

}
