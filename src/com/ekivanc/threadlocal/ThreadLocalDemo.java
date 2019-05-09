package com.ekivanc.threadlocal;

public class ThreadLocalDemo {
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("My First Thread");
		MyThread mt2 = new MyThread("My Second Thread");
		
		mt1.start();
//		mt2.start();
	}

}
