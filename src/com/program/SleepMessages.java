package com.program;

public class SleepMessages {
	public static void heavyCrunch(String i) {

	}
	public static void main(String args[]) throws InterruptedException {
		String inputs[] = {
				"hello",
				"world"
		};
		String importantInfo[] = {
				"Mares eat oats",
				"Does eat oats",
				"Little lambs eat ivy",
				"A kid will eat ivy too"
		};

		Thread t = new Thread(new Runnable() {
			public void run() {	   
				for (int i = 0; i < importantInfo.length; i++) {
					//Pause for 4 seconds
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//Print a message
					System.out.println(importantInfo[i]);
				}
			}
		}
				);
		Thread t2 = new Thread(new Runnable() { 
			public void run() {
				try {
					for (int i = 0; i < inputs.length; i++) {
						heavyCrunch(inputs[i]);
						Thread.sleep(1000);
					}
				}
				catch (InterruptedException e) {
					System.out.println("InterruptedException occur");
				}
			}
		}
				);
		t.start();
		t.join();
		t2.start();
		t2.interrupt();
	}
}

//public class SleepMessages {
//    public static void main(String args[])
//        throws InterruptedException {
//        String importantInfo[] = {
//            "Mares eat oats",
//            "Does eat oats",
//            "Little lambs eat ivy",
//            "A kid will eat ivy too"
//        };
//
//        for (int i = 0;
//             i < importantInfo.length;
//             i++) {
//            //Pause for 4 seconds
//            Thread.sleep(1000);
//            //Print a message
//            System.out.println(importantInfo[i]);
//        }
//        
//        Thread t = new Thread(new Runnable() {
//        	
//        	public void run() {
//
//        		for (int i = 0; i < importantInfo.length; i++) {
//        			Thread t1 = new Thread();
//        			try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//        			t1.interrupt();
//                    if (Thread.interrupted()) {
//                        System.out.println("We've been interrupted: no more crunching.");
//                        return;
//                    }
//                    heavyCrunch(importantInfo[i]);
//
//
//        	}
//       	}
//      });
//        
//    	
// 
//        
//    }
//
//	private static void heavyCrunch(String string) {
//        System.out.println("We've been interrupted: no more crunching.");
//		
//	}
//}