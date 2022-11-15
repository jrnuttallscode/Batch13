//Create a class and demonstrate proper encapsulation techniques
//
// the class will be called Printer
//
// It will simulate a real Computer Printer
//
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
//
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
//
// Decide on the scope, whether to use constructors, and anything else you think is needed.


package com.program;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	public int tonerLevel;
	public int printedPages;
	public static boolean duplex;
	
	public double tonerLevel(int i) {
		if(tonerLevel <= 10) {
			System.out.println("Toner was low and is now filled.");
		} else {
			System.out.println("Toner level is fine.");
			this.tonerLevel = tonerLevel;
		} 
		return tonerLevel;
	}
	
	public double printedPages(int i) {
		if(printedPages > 1) {
			
		} else {
			this.printedPages = printedPages;
		} 
		return printedPages;
	}
	
	public boolean duplex(boolean b ) {
		if (duplex = true) {
            return true;
        }else {
        return false;
        }
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(90);
        list.add(10);
        list.add(908);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
 
        System.out.println("Pages Printed: " + sum);
        
        Printer a = new Printer();
        //a.tonerLevel(15);
        //a.printedPages(120);
        //a.duplex(true);
        
        System.out.println(a.tonerLevel(12)+ " " + a.printedPages(123) + " " + a.duplex(duplex));
        
	}
}
