package com.program;

public class ThreadCounter {

	private int c = 0;

	public synchronized void increment() {
		++c;
	}

	public synchronized void decrement() {
		--c;
	}

	public synchronized int value() {
		return c;
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadCounter obj = new ThreadCounter();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.increment();
				System.out.println(obj.value());
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.decrement();
				System.out.println(obj.value());
			}

		});
		t.start();
		//t.join();
		t2.start();

	}

}