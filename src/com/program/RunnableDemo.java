package com.program;

public class RunnableDemo  {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10;i++) {
					if(i % 2 == 0) {
						System.out.println(i);
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10;i++) {
					if(i % 2 != 0) {
						System.out.println(i);
					}
				}
			}
		});

		
		t.start();
		//which is going finish thread1 first and then execute the next thread
		t.join();
		t.start();
		t.getState();
		t.start();
		t2.start();
		t2.join();
	
	}
}