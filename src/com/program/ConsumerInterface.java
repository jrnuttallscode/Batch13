package com.program;

import java.util.function.Consumer;

public class ConsumerInterface {
	
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}
	
	static void printValue(int val) {
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer1 = ConsumerInterface::printMessage;
		consumer1.accept("Josh");
		Consumer<Integer> consumer2 = ConsumerInterface::printValue;
		consumer2.accept(12);
	}

}
