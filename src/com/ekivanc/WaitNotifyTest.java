package com.ekivanc;

public class WaitNotifyTest {

	
	public static void main(String[] args) {
		System.out.println("The program started");
		
		Message msg = new Message("Here is initial Message Object");
		
		Waiter waiter1 = new Waiter(msg);
		Thread t1 = new Thread(waiter1, "waiter-1");
		t1.start();
		
		Thread t2 = new Thread(waiter1, "waiter-2");
		t2.start();
//		Notifier notif1 = new Notifier(msg);
//		Thread t3 = new Thread(notif1);
//		t3.start();
	}
}
