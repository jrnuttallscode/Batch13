// Create a class ArraylistExample and have a arraylist of string and sort them ,
// in the same class have a arraylist of phone with 6 objects inserted
// and then sort them

package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample implements Comparable<ArrayListExample>{

	String line1;
		
	public ArrayListExample(String line1) {
		
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Override
	public String toString() {
		String q = null;
		return "ArrayListExample [line1=" + line1 + ", q=" + q + ", getLine1()=" + getLine1() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {


	ArrayList<ArrayListExample> q = new ArrayList<>();
	q.add(new ArrayListExample("One"));
	q.add(new ArrayListExample("Two"));
	q.add(new ArrayListExample("Three"));
	q.add(new ArrayListExample("Four"));
	q.add(new ArrayListExample("Five"));
	
	Collections.sort(q);
	
	
	System.out.println(q);
	
	}
	
	int compareTo1(ArrayListExample o) {
		if(this.line1.equals(o.line1))
			return 0;
		int i = this.line1.compareTo(o.line1);
		if(i > 0) {
			return 1;
		}
		else {
			return -1;
		}
}

	@Override
	public int compareTo(ArrayListExample o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

//class arrayListPhone {
//
//	int areaCode;
//	double phoneNumber;
//	
//	public arrayListPhone(int areaCode, double phoneNumber) {
//		
//	}
//
//	public int getAreaCode() {
//		return areaCode;
//	}
//
//	public void setAreaCode(int areaCode) {
//		this.areaCode = areaCode;
//	}
//
//	public double getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(double phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	@Override
//	public String toString() {
//		return "arrayListPhone [areaCode=" + areaCode + ", phoneNumber=" + phoneNumber + ", getAreaCode()="
//				+ getAreaCode() + ", getPhoneNumber()=" + getPhoneNumber() + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
//	
//	ArrayList<arrayListPhone> phone = new ArrayList<>();
//	
//	phone.add(new arrayListPhone(208, 1234567));
//	
//}
















