package com.program;

import java.util.function.Supplier;

public class TestSupplier {
	
	public static void main(String[] args) {
		
		Supplier<Employee> supplier = () -> {
			return new Employee(1001, 25, "Male", "Peru", "Sinha");
		};
		
		Employee p = supplier.get();
		System.out.println("Employee Detail: " + p.toString());
		

	}

}
