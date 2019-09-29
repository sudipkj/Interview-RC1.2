package com.sudip.JavaPractice.threads;

public class ThreadPracSession extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(900L);
				System.out.println("Thread Name : " + Thread.currentThread().getName() + "  :  " + i);
			} catch (InterruptedException ie) {
				System.out.println("exception Occured");
			}
		}

	}

	public static void main(String[] args) throws Exception {

		ThreadPracSession t1 = new ThreadPracSession();
//		t1.setName("T1");
		

		ImplementRunnable ir = new ImplementRunnable();
		Thread t2 = new Thread(ir);
//		t2.setName("T2");

		Thread t3 = new Thread(ir);
//		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		t1.join();
		
		System.out.println(t1.isAlive());
		

	}

}

class ImplementRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500L);
				System.out.println("Thread Name : " + Thread.currentThread().getName() + "  :  " + i);
			} catch (InterruptedException ie) {
				System.out.println("exception Occured");
			}
		}
	}
}
