//A Book Shop wants to display books to users, based on their requirement (Price /Author)  
//
//Design the application for this requirement as follows: Design a class Book which has 
//following attributes String bookname, String author, int price, void display ()   
//
//Design a class ClassicBook which derives from Book and has following attribute - int 
//publishYear - It should have a parameterized constructor to initialize all attributes - 
//It should implement display()  
//
//Note: display () should display the details of the all classical books.  
//
//e.g. ============  
//
//Name: Mein Kampf  
//
//Author: Adolf Hitler  
//
//Price: 1500 publishYear: 1942  
//
//Design a class NewSellingBook which derives from Book with additional attributes as follows String Publisher; 
//
// It should have a parameterized constructor to initialize all the attributes - It should implement display()  
//
//Note: display should display the details of the new released books. e.g 
//============================================================  
//
//Name: Becoming Steve Jobs 
//
//Author: Brent Schlender Rick Tetzeli  
//
//Price: 464  
//
//Publisher: Hodder & Stoughton  


package com.program;

class Book {
	String bookName;
	String author;
	int price;
	
	public Book(String author, String bookName, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		
	}
	
	void display() {
		System.out.println("Title: " + this.bookName + "\n"  + "Author: "
				+ this.author + "\n" + "Price: " + this.price);
	} 
}
	
class ClassicBook extends Book {
		
		int publishYear;
		public ClassicBook(String bookName, String author, int price, int publishYear) {
			super(bookName, author, price);
			this.publishYear = publishYear;
		}
		
		@Override
		void display() {
			super.display();
			System.out.println("Publishyear: " + this.publishYear);
		}
}

class NewSellingBook extends Book {
	
	String publisher;
	
	public NewSellingBook(String bookname, String author, int price, String publisher) {
		super(bookname, author, price);
		System.out.println("Publisher: " + this.publisher);
	}
}

class BookStore {
	static ClassicBook fList[] = new ClassicBook[10];
	static NewSellingBook sList[] = new NewSellingBook[10];
	
	void loadData() {
		for(int i = 0; i < fList.length; i++) {
			if(i == 5) {
				System.out.println("Not enough books.");
			}
			fList[i] = new ClassicBook("Book"+i, "Josh"+i, 2+i, 199i);
		}
		for(int i = 0; i < sList.length; i++) {
			if(i == 5) {
				System.out.println("Not enough books.");
			}
			sList[i] = new NewSellingBook("Book "+i, "Josh"+i, 2+i, "Butter"+i);
		}
	}
	
	void displayByPrice(int startRange, int endRange) {
		for(int i = 0; i < fList.length; i++) {
			if(fList[i].price > startRange && fList[i].price < endRange) {
				fList[i].display();
			}
		}
		for(int i = 0; i < sList.length; i++) {
			if(sList[i].price > startRange && sList[i].price < endRange) {
				fList[i].display();
			}
		}
	}
	
	void displayByAuthor(String b) {
		for(int i = 0; i < fList.length; i++) {
			if(fList[i].author.equalsIgnoreCase(b)) {
				fList[i].display();
			}
		}
		for(int i = 0; i < sList.length; i++) {
			if(sList[i].author.equalsIgnoreCase(b)) {
				sList[i].display();
			}
		}
	}
}

public class OnlineBookShop1{
	public static void main(String[] args) {
		BookStore b = new BookStore();
		b.loadData();
		b.displayByPrice(15, 26);
		System.out.println("------------------------------------");
		b.displayByAuthor("Josh");
	}
}
















