package com.ekivanc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		ExecutorService executerService = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++) {
			Runnable thread =  new WorkerThread("test - "+i);
			executerService.execute(thread);
		}
		
		executerService.shutdown();
		while(executerService.isTerminated()) {
		}
		System.out.println("all tasks completed!");
		
	}
	
}
