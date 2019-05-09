package com.ekivanc.deadlock;

public class ThreadDeadlock {

	
	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
        Object obj2 = new Object();
        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj1), "t2");
        t1.start();
        t2.start();
	}
}
