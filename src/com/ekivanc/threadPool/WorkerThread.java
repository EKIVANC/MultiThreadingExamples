package com.ekivanc.threadPool;

public class WorkerThread implements Runnable {
	
	private String message;
	
	public WorkerThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" is running");
		processMessage();
		System.out.println(Thread.currentThread().getName()+ " is just ended" );
	}

	private void processMessage() {
		try {
			Thread.sleep(300000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
