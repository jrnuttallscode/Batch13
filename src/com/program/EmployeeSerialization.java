// Create a class with name employee and have 5 fields with id, name, address, salary, phone number 
// and try to serialize and de-serialize and also stop phone number from serializing.


package com.program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("employee.txt");

		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.setId(15);
		e.setName("Josh");
		e.setAddress("Centreville");
		e.setSalary(250_000);
		e.setPhone_number(000_000_0000);
		
		obj.writeObject(e);
		System.out.println("Conversion was successful!!");

	}

}	
