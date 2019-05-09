package com.ekivanc;

public class Waiter implements Runnable {

	private volatile Message msg;
	
	
	public Waiter(Message msg) {
		this.msg = msg;
	}
	
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("the thread with name "+name+" running");
//		synchronized (msg) {
			try {
//				msg.wait();
				msg.operate(name);
				System.out.println("the thread with name "+name+"is waiting now");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+" waiter thread got notified and completed at time:"+System.currentTimeMillis());
//		}
	}
}


