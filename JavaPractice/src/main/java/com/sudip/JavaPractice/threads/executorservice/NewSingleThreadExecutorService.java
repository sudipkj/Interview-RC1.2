package com.sudip.JavaPractice.threads.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorService {

	public static void main(String[] args) {

		// New SingleThreadExecutor  with execute
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 10; i<=50; i+=10) {
					try {
						Thread.sleep(100L);
						System.out.println("Hi for the " + i + " time");
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				
			}
		});
		
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 10; i<=50; i+=10) {
					try {
						System.out.println("I am iterating here for " +i);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}				
			}
		});
		
		Callable c = ()->{
			System.out.println("caling callable");
			return "";
		};
		executorService.execute(()-> System.out.println("Hello"));
		
		executorService.shutdown();
		
	}

}
