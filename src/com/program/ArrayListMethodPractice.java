package com.program;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListMethodPractice {

	public static void main(String[] args)
    {
        // create an empty list with an initial
        // capacity
        List<String> list = new ArrayList<String>(5);
 
        // use add() method to initially
        // add elements in the list
        list.add("\"Geeks");
        list.add("For");
        list.add("Geeks\"");
       
        // Add a new element at index 0
        list.add(0, "Hello");
       
        // prints all the elements available in list
        for (String str : list) {
            System.out.print(str + " ");
        }
        
        System.out.println("\n-----------------------------");
        
        List<Double> phone = new ArrayList<Double>(5);
        
        // use add() method to initially
        // add elements in the list
        phone.add((double) 208);
        phone.add((double) 680);
        phone.add((double) 2080);
 
        // Add a new  25 at index 2 and print true if the element is added successfully
        phone.add(2, (double) 25);
 
        // prints all the elements available in list
        for (Double num : phone) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n-----------------------------");

        ArrayList<String> family = new ArrayList<String>(10);
        
        family.add("Josh");
        family.add("Crystal");
        family.add("Delaney");
        family.add("Tyler");
        family.add("Shelbey");
        family.add("Baby 1");
        
        System.out.println("*** Family List ***");
        for(int i = 0; i < 6; i++) {
        	System.out.println(family.get(i).toString());
        }
        
        ArrayList<String> moreFamily = new ArrayList<String>(6);
        moreFamily.add("Baby 2");
        moreFamily.add("Baby 3");
        moreFamily.add("Baby 4");
        moreFamily.add("Baby 5");
        
        family.addAll(moreFamily);
        
    	System.out.println("New size of the list is: " + family.size()); 
    	
    	System.out.println("**** New Family List ****");
    	for(int i = 0; i < 10; i++) {
    		System.out.println(family.get(i).toString());
    	}
    	
        System.out.println("\n-----------------------------");

        //addAll(int index, Collection<? extends E> c)

        ArrayList<Integer> arrayList1 = new ArrayList<Integer> (6);
        
        arrayList1.add(5);
        arrayList1.add(7);
        arrayList1.add(9);
        arrayList1.add(11);
        
        System.out.println(arrayList1);
        
        ArrayList<Integer> arrayList2 = new ArrayList<Integer> (6);
        
        arrayList2.add(13);
        arrayList2.add(15);
        arrayList2.add(17);
        arrayList2.add(19);
        arrayList2.add(21);
        
        System.out.println(arrayList2);
        
        arrayList1.addAll(2, arrayList2);
        
        System.out.println(arrayList1);
        
        System.out.println("\n-----------------------------");

        //clear();
        
        ArrayList<String> stringList1 = new ArrayList<String> (5);

        stringList1.add("De");
        stringList1.add("posit");
        stringList1.add("your");
        stringList1.add("paycheck");
        stringList1.add("and hope");
        stringList1.add("it lasts.");
        
        System.out.println(stringList1);
        
        stringList1.clear();
        
        System.out.println("\n-----------------------------");

        //clone();
        
        
        anotherStrList.add("May no fate willfully misunderstand me\n");
        anotherStrList.add("And half grant what I wish and snatch me away\n");
        anotherStrList.add("Not to return. Earth’s the right place for love:\n");
        anotherStrList.add("I don’t know where it's likely to go better.\n");
        anotherStrList.add("I'd like to go by climbing a birch tree,\n");
        anotherStrList.add("And climb black branches up a snow-white trunk\n");
        anotherStrList.add("Toward heaven, till the tree could bear no more,\n");
        anotherStrList.add("But dipped its top and set me down again.\n");
        anotherStrList.add("That would be good both going and coming back.\n");
        anotherStrList.add("One could do worse than be a swinger of birches.\n");
        
        System.out.println(anotherStrList);
        
        anotherStrList.clone();


    }


//		
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
		
//	ArrayList<Integer> l = new ArrayList<>(); //continuous memory allocation
//	LinkedList<Integer> l1 = new LinkedList<>(); // have links which points to another element in  the list
//	Vector<Integer> v = new Vector<>(); // in the situation of synchronization and thread safety use this class
		
		
}

class clone {
	
	String z = z;
	
}

