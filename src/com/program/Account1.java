package com.program;

//accessing static variable and static method in the
//by using the class name reference
//accessing instance variable and instance method in static method
//by creating the object of the class and using that object you can access

public class Account1 {
	int acc_no;
	String name;
	double balance;

	public static void deposit(int amt) {
		//how can i access the instance variable and instance method
		//just by creating the object and referring to variable and method
		Account s = new Account();
		s.balance += amt;
	}

	public static void withdrawal(int amt) {
		Account ffftfy = new Account();
		ffftfy.balance -= amt;
	}

	public void setAcc_no(int acc_no) {
		//this keyword is going to differentiate between the
		//instance variable and the parameter variable passed to this method
		//instance variable = parameter value passed
		this.acc_no = acc_no;
	}

	public void setName(String name) {
		//instance variable = parameter value passed
		this.name = name;
	}

	public void setBalance(double balance) {
		//instance variable = parameter value passed
		this.balance = balance;
	}

	//instance method
	//in this i will try to access the static method
	public void display () {
		//using the class name i am trying to access the static method
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

		String st = new String("hsuhdi");
		String[] str = new String[3];
		str[0] = st; // same as this str[0] = "hsuhdi";
		str[0].charAt(1); //st.charAt(1);
		str[1] = "eefe";
		str[2] = "dwde";

		Account d1 = new Account();
		d1.acc_no = 100;
		Account d2 = new Account();
		Account[] acct = new Account[2];
		acct[0] = d1;
		acct[0].acc_no = 2323;
		acct[1] = d2;
	}
}