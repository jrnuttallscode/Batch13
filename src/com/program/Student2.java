package com.program;

public class Student2 implements Comparable<Student2> {
	
	int roll_no;
	String name;
	
	public Student2(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student2 [roll_no=" + roll_no + ", name=" + name + ", getRoll_no()=" + getRoll_no() + ", getName()="
				+ getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
//	@Override
//	public int compareTo(Student2 o) {
//		if(this.roll_no == o.roll_no)
//			return 0;
//		if(this.roll_no > o.roll_no)
//			return 1;
//		else
//			return -1;
//	}
	
	@Override
	public int compareTo(Student2 o) {
		if(this.name.equals(o.name))
			return 0;
		int i = this.name.compareTo(o.name);
		if(i > 0) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}


