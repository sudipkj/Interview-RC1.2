package com.sudip.JavaPractice.threads;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable has started");
		for(int i = 10; i<=50; i+=10) {
			
			try {
				Thread.sleep(10);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadClass t1 = new MyThreadClass();
		t1.start();
		
		RunnableThread th = new RunnableThread();
		Thread t2 = new Thread(th);
		
		try {
			t1.join();
		} catch (Exception e) {
		}
		
		t2.start();
		
	}

}
