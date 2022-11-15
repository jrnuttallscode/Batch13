package com.program;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders {
	
	public static void main(String args[]){
	{
		IntStream stream = "123456_abcdefg".chars(); 
		stream.forEach(p -> System.out.println(p));
		
		// Or
		
		Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
		stream1.forEach(p -> System.out.println(p));
		
		//create streams
//		Stream<String> streamOfStrings =  Stream.of("Sunday", "Monday", "Wednesday", "Friday");
//		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		Stream<Integer> streamOfArrayOfIntegers = Stream.of(array);
//		
//		System.out.println(array);
	}
}}