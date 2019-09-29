package com.sudip.JavaPractice.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorServices {

	public static void main(String[] args) {

		// NewSingleThreadExecutor
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(() -> {
			System.out.println("Doing first task " + Thread.currentThread().getName());
		});

		service.execute(() -> {
			System.out.println("Doing Second task " + Thread.currentThread().getName());
		});

		service.shutdown();

		// NewSingleThreadScheduledExecutor
		ExecutorService ex = Executors.newSingleThreadScheduledExecutor();
		ex.submit(() -> System.out.println("NewSingleThreadScheduledExecutor"));

		// NewCachedThreadPool
		ExecutorService ex2 = Executors.newCachedThreadPool();
		System.out.println(ex2.submit(() -> "success"));

		ExecutorService ex3 = Executors.newFixedThreadPool(5);
		ex3.execute(() -> System.out.println("executing in the fixed thread pool of 5 theads"));

		// NewFixedThreadPool
		// NewScheduledThreadPool
	}

}
