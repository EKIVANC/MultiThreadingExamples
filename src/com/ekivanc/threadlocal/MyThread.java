package com.ekivanc.threadlocal;

public class MyThread extends Thread{
	
	private static int question = 15; 
	
	
	private static ThreadLocal localvar = new ThreadLocal() {
		
		protected Object initialValue() {
			question = question- 1;
			return new Integer( question );
		}
	};
	
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(this.getName()+ " "+ localvar.get());
		}
	}

	
	
}
