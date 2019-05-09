package com.ekivanc;

public class Message {

	public Message(String message) {
		this.msg = message;
		System.out.println("a new message object created!");
	}

	public void operate(String threadName) throws InterruptedException {
		for (int i = 0; i < 1000000000; i++) {
			this.msg = i + " - threadName: "+Thread.currentThread().getName();
			System.out.println(msg);
			Thread.currentThread().sleep(1000);
		}

	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
