public class AccessModifierDemo1 {
	//3 instance variable with access modifier public
	//2 Variable with no access modifier
	int a = 10;
	int b = 10;
	private int c = 10;
	private int d = 10;
	public int e = 10;
	
	//1 instance methods with access modifier public
	//1 no access modifier method
	void add() {
		
	}
	
	private void subtract() {
		
	}
	
	public static void main(String[] args) {
		//as this class is public class i can create a object 
		AccessModifierDemo1 d = new AccessModifierDemo1();
		//this is with no access modifier but still accessible inside its main
		d.a = 10;
		d.b = 12;
		
		//this is with private access modifier but still accessible inside its main
		d.c = 100;
		d.d = 123;
		//i was able to access all the variable and method of this class
		//in its main method
		
		
		d.e = 2324;
		
		//this is with no access modifier but still accessible inside its main
		d.add();
		//this one has private access modifier and still can be access
		//in its main method
		d.subtract();
		
		
		
		

	}

}