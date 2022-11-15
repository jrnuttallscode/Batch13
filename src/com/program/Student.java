package com.program;

import java.io.Serializable;
import java.util.Objects;

//POJO: plain old java objects
//Can have just the variable, its getter and setter, and a toString(); method
//No main() and no business logic can be written. 
//Serializable interface is a marker interface which doesn't have any methods defined in it.
//By looking at the *implements Serializable* the JVM is capable of running some methods by itself.

public class Student implements Serializable {
	private int roll_number;
	//transient is
	private transient String name;
	private String address;
	private double phone_number;
	private String major;
	private String minor;
	
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
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
	public double getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(double phone_number) {
		this.phone_number = phone_number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", address=" + address + ", phone_number="
				+ phone_number + ", major=" + major + ", minor=" + minor + ", getRoll_number()=" + getRoll_number()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone_number()="
				+ getPhone_number() + ", getMajor()=" + getMajor() + ", getMinor()=" + getMinor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, major, minor, name, phone_number, roll_number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(major, other.major)
				&& Objects.equals(minor, other.minor) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(phone_number) == Double.doubleToLongBits(other.phone_number)
				&& roll_number == other.roll_number;
	}
	
	
	
	
}