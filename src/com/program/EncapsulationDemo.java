package com.program;

public class EncapsulationDemo {
	private int empId;
	private String name;
	private int age;
	private double salary;
	private String address;
	
	
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
		EncapsulationDemo d = new EncapsulationDemo();
		d.setEmpId(123);
		d.setName("vidya");
		d.setAddress("Sterling");
		d.setAge(12);		
		d.setSalary(200);
		
		System.out.println(d.getEmpId()+ " " + d.getName() + " " + d.getAddress()
				+ " " + d.getAge() +  " "+ d.getSalary() );
		
	}

}