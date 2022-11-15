package com.program;
//parent is called super class of child
class ParentDemo2{
	private int accno;
	private String name;
	private double balance;
	
	public ParentDemo2() {
		
	}
	
	public ParentDemo2(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public void display() {
		System.out.print(this.accno + this.name + this.balance);
	}
	
		
}

//child is subclass of parent
public class ChildDemo extends ParentDemo{
	public double minbalance;

	
	public ChildDemo(int accno, String name, double balance , double minbalance) {
		super(accno, name, balance);
		this.minbalance = minbalance;
		
		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.print(this.minbalance);
	}

	public static void main(String[] args) {
//		ParentDemo d = new ParentDemo(1233, "vidya", 234.23);
//		d.display();
		
		ChildDemo d = new ChildDemo(1234,"vidya",3344.3,222);
		d.display();
		
	}

}