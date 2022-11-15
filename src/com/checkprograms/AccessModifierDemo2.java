import com.program.AccessModifierDemo1;
//import com.program.Demo;

public class AccessModifierDemo2 {
	int a = 20;
	int b = 232;
	public static void main(String[] args) {
		AccessModifierDemo2 e = new AccessModifierDemo2();
		e.a = 239;
		e.b =233;
			
		//even if its a public class you need to import the class
		//and then you can access the methods and variables 
		AccessModifierDemo1 d = new AccessModifierDemo1();
		//becoz you have defined your class with no access modifier
		//Demo d1 = new Demo();
		
		
		// you cannot access it becoz you are in different package 
		//and a and b are variable with no access modifier
		d.a = 10;
		d.b = 12;
		d.c = 100;
		d.d = 123;
		d.e = 2324;
		
		
		// you cannot access it becoz you are in different package 
		//and a and b are variable with no access modifier
		d.add();
		d.subtract();

	}

}