//As i said runtime polymorphism is a concept of overriding 
//override is a concept of inheritance 
//having same method signature in the child which is same as parents

class Parent {
	public void sub() {
		
	}
	public void add() {
		System.out.println("im in parent");
	}
	
}

public class RuntimePolymorphismDemo2 extends Parent{
	//this annotation is used to strictly check for signature
	@Override
	public void add() {
		System.out.println("im in child");
	}
	
	public void divide() {
		
	}

	public static void main(String[] args) {
		RuntimePolymorphismDemo2 d = new RuntimePolymorphismDemo2();
		//which method to call 
		//is it from parent or child will be decided at runtime
		//thats the reason its called dynamic or runtime polymorphism
		d.add();
		
		//object of child referencing the parent 
		//this object p is capable of accessing all member of parent 
		//and the overrided method in the child class
		Parent p = new RuntimePolymorphismDemo2();
		//child method will be called but it will be decided during runtime
		p.add();

	}

}