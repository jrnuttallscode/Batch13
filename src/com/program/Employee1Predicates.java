package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee1Predicates {

	public static Predicate<Employee> isAdultMale() {
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	} 
	
	public static Predicate<Employee> isAdultFemale() {
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}
	
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return p -> p.getAge() > age;
	}
	
	public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	} 

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Josh", "Nuttall", 45, "M", 1069);
		l.add(new Employee("Josh", "Nut", 46, "M", 1059);
		l.add(new Employee("Josh", "Tall", 35, "M", 1079);
		l.add(new Employee("Josh", "Nutt", 25, "M", 1089);
		
		System.out.println(filterList(l.isAdultMale()));;
		System.out.println(filterList(l.isAdultFrmale()));
	}
}
