package com.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LibraryBooks  {
	
	double isbn;
	String author;
	String publisher;
	
	public LibraryBooks(double isbn, String author, String publisher ) {
		
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
	}
	
	public LibraryBooks(double d) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		
		return this.isbn + " " + this.author + " " + this.publisher;
	}
	
}

class SortByAuthor implements Comparator<LibraryBooks> {
	
	public int compare(LibraryBooks a, LibraryBooks b) {
		
		return a.author.compareTo(b.author);
	}
}

class SortbyPublisher implements Comparator<LibraryBooks> {
	 
    public int compare(LibraryBooks a, LibraryBooks b)
    {
 
        return a.publisher.compareTo(b.publisher);
    }
}

class Main {
	
	private static final String Tolkien = null;
	private static final String HarperCollins = null;

	public static void main(String[] args) {

		ArrayList<LibraryBooks> lib = new ArrayList<LibraryBooks>();
		
		lib.add(new LibraryBooks(978.1569456322, "Tolkien", "HarperCollins"));
		lib.add(new LibraryBooks(978.1554658352, "Godwin", "William Morrow"));
		lib.add(new LibraryBooks(978.0255635889, "Hunter", "Fededral Fools"));
		lib.add(new LibraryBooks(978.1569456322, "Baldacci", "Bloomfield"));
		lib.add(new LibraryBooks(978.1569456322, "Grimes", "DoubleDay"));
		lib.add(new LibraryBooks(978.1569456322, "Frost", "WW Norton"));
		
		System.out.println("Unsorted");
		
		for (int i = 0; i < lib.size(); i++) 
			System.out.println(lib.get(i));
		
		Collections.sort(lib, new SortByAuthor());
		
		System.out.println("\nSorted By Author");
		
		

	}

}
