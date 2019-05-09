package com.ekivanc;

public class Test {
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = () -> { 
			
		    for (int i = 0; i < 10; i++) {
		    	System.out.println(i + "threadName: "+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(runnable, "first Thread");
		t1.start();
//		Thread.yield();
		Thread t2 = new Thread(runnable, "second Thread");
		t2.start();
		
	}

}
