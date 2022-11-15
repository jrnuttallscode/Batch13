package com.program;

//threads are lightweight process
//it has its own memory called stack
//it is in package java.lang.Thread so automatically available
//start method just starts a thread

public class ThreadDemo extends Thread {

	@Override

	public void run() {

		System.out.println("world");

		System.out.println(Thread.activeCount());

	}



	public static void main(String[] args) throws CloneNotSupportedException {

		ThreadDemo d = new ThreadDemo();

		d.start();

		System.out.println(Thread.currentThread());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		//number of thread active at that point of time
		System.out.println(Thread.activeCount());

		//deprecated and void return type
		d.checkAccess();
		//Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.
		//Object o = d.clone();
		//printing the error msg by the developer
		//System.err.println("hkege");
		
		//Thread.dumpStack();

		System.out.println("----------------------------");
		
		System.out.println(d.getId());
		
		System.out.println("----------------------------");

		System.out.println(d.getName());
		
		
		//Returns this thread's name.
		//int getPriority()
		//Returns this thread's priority.
		//getState()
		//Returns the state of this thread.
		//ThreadGroup getThreadGroup()
		//holdsLock(Object obj)
		//Returns true if and only if the current thread holds the monitor lock on the specified object.
		//void interrupt()
		//Interrupts this thread.
		//static boolean interrupted()
		//Tests whether the current thread has been interrupted.
		//boolean isAlive()
		//Tests if this thread is alive.
		//boolean isDaemon()
		//Tests if this thread is a daemon thread.
		//boolean isInterrupted()
		//Tests whether this thread has been interrupted.
		
	}
}