package com.ekivanc;

public class Notifier implements Runnable {

	private Message msg;
	
	public Notifier(Message msg) {
		this.msg  = msg;
	}
	
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name +" started");
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name +" notifier work done!");
				msg.notify();
			}
		}
		catch(InterruptedException e ) {
			e.printStackTrace();
		}
	}

	
	
	
}
