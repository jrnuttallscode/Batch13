package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ConsumerInterfaceDemo {
	
	static void addList(List<Integer> list) {
		
		int result = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of list values:" + result);
	}

	public static void main(String[] args) {
		
		

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Consumer<List<Integer>> consumer = ConsumerInterfaceDemo::addList;
		consumer.accept(list);

	}
}
