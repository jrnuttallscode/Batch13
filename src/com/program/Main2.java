package com.program;

public class Main2 {

	public static void main(String[] args) {
		DigitalWatch dw = new DigitalWatch();
		dw.stopWatch();
		dw.alarm();
		dw.tiking();
		dw.worldClock();
		//its a common method to any object which ever is implementing this interface
		//its a static method call using the interface name 
		Watch.doSomething();
		
		AnaloglWatch ds = new AnaloglWatch();
		ds.stopWatch();
		ds.alarm();
		ds.tiking();
		ds.worldClock();

	}

}

class DigitalWatch implements Watch {

	
	public void tiking() {
		// TODO Auto-generated method stub
		System.out.println("this is in the tiking method");
		
	}

	public void stopWatch() {
		// TODO Auto-generated method stub
		System.out.println("this is in the stopwatch method");
		
	}

	@Override
	public void alarm() {
		//this is a default method in the interface 
		System.out.println("set based on your timing");
		
	}
	
}

class AnaloglWatch implements Watch{

	
	public void tiking() {
		// TODO Auto-generated method stub
		
	}


	public void stopWatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		
	}
	
}

class Clock implements Watch{

	
	public void tiking() {
		// TODO Auto-generated method stub
		
	}


	public void stopWatch() {
		// TODO Auto-generated method stub
		
	}
	
}