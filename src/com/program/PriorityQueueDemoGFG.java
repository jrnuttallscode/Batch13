package com.program;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemoGFG {

	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(854);
		numbers.add(3214);
		numbers.add(1250);
		numbers.add(7895);
		numbers.add(63556622);
		numbers.add(4556820);
		numbers.add(85441);
		numbers.add(4463);
		numbers.add(2611);

		
//		System.out.println(numbers.peek());
//		System.out.println(numbers.poll());
//		System.out.println(numbers.peek());
		
		// Iterates through each element of the queue.
		Iterator<Integer> iterator = numbers.iterator();
			while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		// Outputs an array of elements in the queue
		 Object[] array = numbers.toArray();
		 
		 System.out.println("The array list is: " + numbers);
		 //for (int j = 0; j < array.length; j++)
		 		
		 	//System.out.println(array[j]);
	}
}

