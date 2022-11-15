package com.program;

public class PersonalInformation {
	
	public static void main(String[] args) {
		 
		Lambdas list1 = (firstName, lastName, city) -> {
			
			return "Welcome to " + city + " " + firstName + " " + lastName + ". We're glad you're here.";
		};
		System.out.println(list1.person("Josh", "Nuttall", "Centreville,"));
	}
	
}
