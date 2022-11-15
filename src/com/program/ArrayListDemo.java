package com.program;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(); //continous memory allocation
		LinkedList<Integer> l1 = new LinkedList<>(); // have links which points to another element in  the list
		Vector<Integer> v = new Vector<>(); // in the situation of syncronization and thread safety use this class
		
		
		//CRUD operation 
		//create retrieve update and delete
		//we cannot have primitive data for the collection
		//everything you store should of object
		l.add(13);
		l.add(12);
		l.add(134);
		l.add(43);
		l.add(343);
		l.add(324324);
		l.add(32434);
		l.add(343446456);
		l.add(5666);
		l.add(156452);
		l.add(56643);
		l.add(3443);
		
		Collections.sort(l);
		System.out.println(l);
		
//		add(int index, E element)
//		addAll(Collection<? extends E> c)
//		addAll(int index, Collection<? extends E> c)
//		clear();
//		clone();
//		contains(Object o);
//		get(int index)		
//		int	indexOf(Object o)
//		boolean	isEmpty()
//		remove(int index)
//		boolean	remove(Object o)
//		boolean	removeAll(Collection<?> c)
//		retainAll(Collection<?> c)
//		set(int index, E element)
//		int	size()
//		toArray()
//		trimToSize()
//		
		
		
		
		ArrayList<Student2> j = new ArrayList<>();
		j.add(new Student2(123,"vidya"));
		j.add(new Student2(1233,"bla"));
		j.add(new Student2(111,"bla bla"));
		j.add(new Student2(112,"ka kka"));
		j.add(new Student2(34443,"ha ha ha"));
		
		//here you are noyt able to sort elements of the Student class becoz
		//its a combination of multiple datatypes so its hard to decide on which 
		//datatype to sort
		//to overcome this problem we have 2 interfaces
		//Comparable and comparator interface which has method compareTo() and compare() to implement 
		//compareTo method returns 0 , 1, -1 if equal, greater than or less than
		//comparable interface compare 2 elements of same class
		//comparator interface compare 2 elements of different class
		
//		Comparator<Student1> c = new Comparator<>() {
//
//			@Override
//			public int compare(Student1 o1, Student1 o2) {
//				if(o1.roll_no == o2.roll_no)
//					return 0;
//				if(o1.roll_no > o2.roll_no) {
//					return 1;
//				}
//				else {
//					return -1;
//				}
//			}
//			
//		};
		
		Comparator<Student2> c = new Comparator<>() {
			
						@Override
						public int compare(Student2 o1, Student2 o2) {
							if(o1.name.equals(o2.name))
								return 0;
							int i = o1.name.compareTo(o2.name);	
							if(i > 0) {
								return 1;
							}
							else {
								return -1;
							}
							
						}
						
					};
		Collections.sort(j, c);
		
		System.out.println(j);
		

	}

}