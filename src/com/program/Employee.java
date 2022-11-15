package com.program;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String name;
	private String address;
	private double salary;
	private transient double phone_number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(double phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ ", phone_number=" + phone_number + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getSalary()=" + getSalary() + ", getPhone_number()="
				+ getPhone_number() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}