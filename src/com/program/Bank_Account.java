// Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        // 1.  To allow the customer to deposit funds (this should increment the balance field).
        // 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
//        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
//              //  "(087) 123-4567");
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);

package com.program;

public class Bank_Account {

	//instance variable
	public long account_number = 12345;
	public double balance = 0.0;
	public String customer_name = "Bob Brown";
	public String email = "myemail@bob.com";
	public int phone_number = 187_123_4567;

		public void deposite(double amt) {
		balance +=  amt;
		System.out.println(balance);
	}
	public void withdrawal(double amt) {
		if(amt < balance) {
			balance -=  amt;
			System.out.println(balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public static void main(String[] args) {

		Bank_Account bobsAccount = new Bank_Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
		//  "(087) 123-4567");
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposite(50.0);
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposite(51.0);
		bobsAccount.withdrawal(100.0);
		
		System.out.println(bobsAccount.account_number);
		System.out.println(bobsAccount.balance);
		System.out.println(bobsAccount.customer_name);
		System.out.println(bobsAccount.email);
		System.out.println(bobsAccount.phone_number);
	}
}