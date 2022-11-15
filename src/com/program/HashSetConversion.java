package com.program;

import java.util.ArrayList;
import java.util.Collections;

public class HashSetConversion implements Comparable<HashSetConversion>{

	String element;
	
	public HashSetConversion (String element) {
		
	}
	
	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
	@Override
	public String toString() {
		return "HashSetConversion [element=" + element + ", getElement()=" + getElement() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {

		ArrayList<HashSetConversion> q = new ArrayList<>();
		q.add(new HashSetConversion("BMW"));
		q.add(new HashSetConversion("Mahindra"));
		q.add(new HashSetConversion("Jaguar"));
		q.add(new HashSetConversion("Tata"));
		q.add(new HashSetConversion("Ferrar"));
		
		Collections.sort(q);
		
		
		System.out.println(q);
		
		}
		
		int compareTo1(HashSetConversion o) {
			if(this.element.equals(o.element))
				return 0;
			int i = this.element.compareTo(o.element);
			if(i > 0) {
				return 1;
			}
			else {
				return -1;
			}
	}

		@Override
		public int compareTo(HashSetConversion o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

