package com.ekivanc.atomicTypes;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
		SampleThread st = new SampleThread(); 
		Thread t1 = new Thread(st, "t1");
		Thread t2 = new Thread(st, "t2");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(st.getCounter());
	}
	
}
