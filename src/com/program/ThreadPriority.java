package com.program;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ThreadPriority {

	public static void main(String[] args) {

		PriorityQueue<String> numberThreads = new PriorityQueue<String>();

		numberThreads.add("First");
		numberThreads.add("Second");
		numberThreads.add("Third");
		numberThreads.add("Fourth");
		numberThreads.add("Fifth");




		Iterator<String> iterator = numberThreads.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		Object[] array = numberThreads.toArray();

		System.out.println("The array list is: " + numberThreads);

	}

}