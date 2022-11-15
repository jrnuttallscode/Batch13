package com.program;

import java.util.ArrayList;

public class ThreadSyncBlockDemo {
	String lastName;
	int nameCount;

	public void addName(String name) {
		//over here we can replace arraylist with vector and it going to do the 
		//synchronization
		//sync means changes made to the object by one thread is visible to all
		//other thread which acts on it

		ArrayList<String> nameList = new ArrayList<>();
		synchronized(this) {
			lastName = name;
			nameCount++;
		}
		nameList.add(name);

		System.out.println(nameList);
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadSyncBlockDemo d = new ThreadSyncBlockDemo();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				d.addName("hello");

			}

		}
				);
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				d.addName("sdfwdf");

			}

		}
				);
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				d.addName("dfewr");

			}

		}
				);
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				d.addName("sdasd");

			}

		}
				);
		//joins is used for ordering the data not synchronization 
		//
		t.start();
		t.join();
		t1.start();
		t1.join();

		t2.start();
		t2.join();
		t3.start();




	}

}