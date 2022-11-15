package com.program;

//accessing static variabel and static method in the
//by using the class name reference
//accessing instance variable and instanec method in static method
//by creating the object of the class and using tat object you can access

public class Account {
	int acc_no;
	String name;
	double balance;

	public static void deposit(int amt) {
		//how can i access the insatnce variable and instance method
		//just by creating the object and refering to variable and method
		Account s = new Account();
		s.balance += amt;
	}

	public static void withdrawal(int amt) {

		Account ffftfy = new Account();
		ffftfy.balance -= amt;
	}

	public void setAcc_no(int acc_no) {
		//this keyword is going to differentiate between the
		//instance varible and the parameter variable passed to this method
		//instance varaible = parameter value passed
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		//instance varaible = parameter value passed
		this.name = name;
	}

	public void setBalance(double balance) {

		//instance varaible = parameter value passed

		this.balance = balance;

	}



	//instance method
	//in this i will try to access the static method
	public void display () {
		//using the class name i am trying to accces the static method
		Account.deposit(1234);
		Account.withdrawal(12344);
	}




	public static void main(String[] args) {
		Account d = new Account();
		//setter method
		//setting value to the instance variable
		d.setAcc_no(12344);
		d.setName("vidya");
		d.setBalance(1000.0);


		// This is another way of doing the same thing.
		// public static void main(String[] args) {

		// new Account();
		// //setter method
		// //setting value to the instance variable
		// new Account().setAcc_no(12344);
		// new Account().setName("vidya");
		// new Account().setBalance(1000.0);

	}
}