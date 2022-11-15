package com.program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LaptopSerialization {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("laptop.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		Laptop l = new Laptop();
		l.setName("Biff"); 
		l.setIpAddress(01_236_55_098);
		l.setColor("Green");
		l.setScreen_Size(15.0); 
		l.setPrice(495.99);
		
		obj.writeObject(l);
		
	}

}
