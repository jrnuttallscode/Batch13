package com.program;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//1.Create a user defined Exception namely StuException. Give the details - StudentID, StudentName and StudentPercentage as variables ,take in 5 values for each as follows:
//
//StudentID - (101,102,103,104,105)
//
//StudentName -(luke,bobo, sharanya, jose, imitiaz)
//
//StudentPercentage - (75, 80, 68, 35, 89)
//
//Throw an user defined exception if the Student Percentage  is less than 40.


//2.Write a Program and Create 5 thread objects and set name for all the five thread as “First”, “Second”, “Third”, “Fourth” and “Fifth”.
//Now firstly get the Priority for all the threads and set new Priority for all the Threads and print the Name of threads with their Priority.
public class ExceptionDemo {

	public static void main(String[] args) throws StuException {
//		Studnet s = new Studnet(101, "luke", 75);
//		Studnet s1 = new Studnet(102, "bobo", 80);
//		Studnet s2 = new Studnet(103, "sharanaya", 68);
//		Studnet s3 = new Studnet(104, "jose", 35);
//		Studnet s4 = new Studnet(105, "imitiaz", 89);
//		
//		List<Studnet> stu = new ArrayList<>();
//		stu.add(s);
//		stu.add(s1);
//		stu.add(s2);
//		stu.add(s3);
//		stu.add(s4);
//		for(Studnet s10: stu) {
//			if(s10.student_percentage < 40) {
//				throw new StuException("this student has very less percentage ");
//			}
//		}
//		
//-----------------------------------------------------------------------------//
		
		Thread first = new Thread();
		Thread second = new Thread();
		Thread third = new Thread();
		Thread fourth = new Thread();
		Thread fifth = new Thread();
		
		System.out.println(first.getPriority());
		System.out.println(second.getPriority());
		System.out.println(third.getPriority());
		System.out.println(fourth.getPriority());
		System.out.println(fifth.getPriority());
		
		first.setPriority(2);
		second.setPriority(8);
		third.setPriority(5);
		fourth.setPriority(10);
		fifth.setPriority(1);
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);	
		System.out.println(fourth);	
		System.out.println(fifth);	
		
	//-------------------------------------------------------------------------------------------------------------------//
//		3.Write a Code to take 5 elements in HashSet and convert it into LinkedList and sort it
//
//		Elements are – [BMW, Mahindra, Jaguar, Tata, Ferrar]
		
		Set<String> setDemo = new HashSet<>();
		setDemo.add("Bmw");
		setDemo.add("mahindra");
		setDemo.add("jaguar");
		setDemo.add("tata");
		setDemo.add("ferrar");
		
		LinkedList<String> l = new LinkedList<>();
		
		l.addAll(setDemo);
		Collections.sort(l);
		System.out.println(l);
		//-----------------------------------------------------------------------------------//
		
//		4.Write a code and pass four values through SuperMarket class to TreeSetExample class and add the value in TreeSet and sort the elements by the name of the product .
//
//		Values {101,Lays,5,$2}
//
//		Values {102,BiskFarm Biscuits,3,$5}
//
//		Values {103,Maggie Ketchup,2,$3}
//
//		Values {104,Dairy Milk,7 ,$10}
//
//		Values {105,XYZ Soap,1, $1}
		
		Set<SuperMarket> sup = new HashSet<>();
		sup.add(new SuperMarket(101,"Lays",5,2));
		sup.add(new SuperMarket(102,"BiskFarm Biscuits",3,5));
		sup.add(new SuperMarket(103,"Maggie Ketchup",2,3));
		sup.add(new SuperMarket(104,"Dairy Milk",7 ,10));
		sup.add(new SuperMarket(105,"XYZ Soap",1, 1));
		
		System.out.println(sup);
		
		Comparator<SuperMarket> c = new Comparator<>() {

			public int compare(SuperMarket o1, SuperMarket o2) {
				if(o1.getName().equals(o2.getName())){
					return 0;
				}
				int i = o1.getName().compareTo(o2.getName());
				if(i > 0) {
					return 1;
				}
				else {
					return -1;
				}		
		    }
	    };
	    
	    ArrayList<SuperMarket> l2 = new ArrayList<> ();
	    l2.addAll(sup);	    
	    Collections.sort(l2,c);
	    System.out.println(l2);
	}

}

class Studnet {
	int studnet_id;
	String student_name;
	double student_percentage;
	public Studnet(int studnet_id, String student_name, double student_percentage) {
		this.studnet_id = studnet_id;
		this.student_name = student_name;
		this.student_percentage = student_percentage;
	}
	public int getStudnet_id() {
		return studnet_id;
	}
	public void setStudnet_id(int studnet_id) {
		this.studnet_id = studnet_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public double getStudent_percentage() {
		return student_percentage;
	}
	public void setStudent_percentage(double student_percentage) {
		this.student_percentage = student_percentage;
	}
	@Override
	public String toString() {
		return "Studnet [studnet_id=" + studnet_id + ", student_name=" + student_name + ", student_percentage="
				+ student_percentage + "]";
	}
	
	
}

class SuperMarket {
	int prodId;
	String name;
	int quantity;
	double price;
	
	public SuperMarket(int prodId, String name,int quantity, double price) {
		this.prodId = prodId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SuperMarket [prodId=" + prodId + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}