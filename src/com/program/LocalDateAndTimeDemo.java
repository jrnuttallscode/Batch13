package com.program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateAndTimeDemo {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate.EPOCH);
		System.out.println(localDate.toEpochDay());
		
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek().toString());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.plusDays(12).toString());
		
		System.out.println("--------------------------");		
		
		LocalTime d1 = LocalTime.now();
		System.out.println(d1.toString());
		
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
//		System.out.println(d1.);
		
		System.out.println("--------------------------");		

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.toString());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getNano());
		
		System.out.println("--------------------------");		

		Instant instant = Instant.now();
		
		System.out.println(instant.toString());
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString());
		System.out.println(instant.minusSeconds(10).toString());
		
		Period period = Period.ofDays(6);
		
		
		
		

		

	}

}
