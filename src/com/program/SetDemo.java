package com.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//set is interface which cannot have duplicates
//hashset is implementation class which doesn't follow insertion order 
//LinkedHashSet follows insertion order
//Sorted set is a subclass of Set and it has a implementation class
//called as TreeSet and its sorted in ascending order
//if you want in reverse order then you must convert a set to list and 
//Collections.reverse(list) will sort it in reverse order.
//iterator() is a method which is in Iterable interface which is grand
//parent of Set interface so all implementation class can have this method
//splitIterator is a method which works with huge data by spliting it 
//forEach(consumer) is from JAVA8 feature
public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> i = new HashSet<>();
		i.add(10);
		i.add(12);
		i.add(23234);
		i.add(344);
		i.add(34);
		i.add(null);
		i.add(10);//these are duplicates and not allowed in Set
		i.add(10);//these are duplicates 
		i.add(10);//these are duplicates 
		
		System.out.println(i);
		
		Set<Integer> i1 = new LinkedHashSet<>();
		i1.add(10);
		i1.add(12);
		i1.add(23234);
		i1.add(344);
		i1.add(34);
		i1.add(null);
		i1.add(10);//these are duplicates 
		i1.add(10);//these are duplicates 
		i1.add(10);//these are duplicates 
		System.out.println(i1);
		
		//interface referenceobject = new implementation_class
		//you cannot have null value inserted into a TreeSet
		//it's going to throw NullPointerException
		SortedSet<String> s = new TreeSet<String>();
		s.add("a");
		s.add("z");
		s.add("b");
		s.add("a");
		s.add("q");
		s.add("r");
		s.add("g");
		//s.add(null); //runtime error nullpointerexception is being thrown 
		System.out.println(s);
	}
}