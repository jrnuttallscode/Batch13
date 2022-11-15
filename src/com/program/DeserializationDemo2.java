package com.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//ARM which is automatic resource management
		//in the try block i will instantiate the object 
		//which implements auto-closable marker interface 
		//
		try(FileInputStream file = new FileInputStream("josh.txt")){
			
			ObjectInputStream obj = new ObjectInputStream(file);
		
			Student object = (Student) obj.readObject();
			System.out.println(object.toString());
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//its not that you don't require the finally block 
		//all the  open connection must be closed 
		//for those open connection which are auto-closable you don't need to write in finally 
		//rest of the connections must go in finally block like SQL connection close
//		finally {
//			file.close();
//		}
		
	}

}