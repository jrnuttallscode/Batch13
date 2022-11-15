package com.program;

public class EncapsulationDemo2 {
	private int empId;
	private String name;
	private int age;
	private double salary;
	private String address;
	
	//syntax for writing a constructor
	//its a special method with class_name as method name and
	//there is no return type
	//access_modifier class_name(parameter) {
	//simple logic 
	//}
	//default parameterless constructor which if you don't define 
	//compiler is going to provide you 
	//but once you start defining your own constructor compile won't provide you 
	//with any default
	//you can create n no.of constructor with different no.of parameters but the syntax will stay same
	public EncapsulationDemo(int empid, String name, String address, double salary, int age) {
		this.empId = empid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public EncapsulationDemo2() {
		
	}
	public EncapsulationDemo2(double salary) {
		if(salary > 2000) {
			this.salary = salary;		
		}
	}
	public EncapsulationDemo2(int age) {
		if(age <= 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	public EncapsulationDemo2(String name) {
		this.name = name;
	}
	
	
	//must have public access modifier
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}
	
	
	public static void main(String[] args) {
		EncapsulationDemo2 d1 = new EncapsulationDemo2();
		
		EncapsulationDemo2 d = new EncapsulationDemo2(434,"vidya","Sterling",12,200);
//		d.setEmpId(123);
//		d.setName("vidya");
//		d.setAddress("Sterling");
//		d.setAge(12);
//		d.setSalary(200);
		
		EncapsulationDemo2 d2 = new EncapsulationDemo2(2324,"refer","feer",3,2344);
		
		System.out.println(d.getEmpId()+ " " + d.getName() + " " + d.getAddress()
				+ " " + d.getAge() +  " "+ d.getSalary() );
		
	}

}