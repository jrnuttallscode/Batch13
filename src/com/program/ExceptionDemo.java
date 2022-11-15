package com.program;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//System.exit(2);
		//try cannot exist buy . it needs some support of either catch, finally, or both. 
		try {
			//inside try you can have try and catch called as nested try catch or try finally block
			int divide = a/b;
			int i = Integer.decode("133");
			System.out.println(divide);
		}
		
		
		//can i have multiple catch blocks?
		//i can have any number of catch block
		//the hierarchy of the parent child has to be followed
		//that is have child first and then have all the parent and grand parent 
		catch(ArithmeticException e) {
			System.out.println("Dividing a nunber by 0 is not allowed.");
			//System.exit(5765);
		}
		catch(RuntimeException e ) {
			System.out.println("it's a number format but it's under parent runtime and this line is excuted.");
		}
		catch(Exception e) {
			
		}	
		//is there a way to stop finally from executing 
		//using the System.exit(121);
		finally {
			//no matter you have exception or not this block will be always executed so 
			//its best to have a finally block after all the catches which handle error
			//is there a way to stop finally from executing??
			//yes there is by using the System.exit(1);
			//to close certain connections
		}
		System.out.println("I'm out of the try and catch block, but "
				+ "even though there is an error in the code, this line of code still excutes.");
	}

}