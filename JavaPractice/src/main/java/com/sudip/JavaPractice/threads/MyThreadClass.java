package com.sudip.JavaPractice.threads;

public class MyThreadClass extends Thread	{

	public void run() {
			
		for(int i = 0; i<=5; i++) {
			
			try {
				Thread.sleep(10);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
