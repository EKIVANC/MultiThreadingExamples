package com.ekivanc.atomicTypes;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;

public class SampleThread implements Runnable{

//	private AtomicInteger counter = new AtomicInteger(0);
	private AtomicReference<Integer> counter = new AtomicReference<Integer>(0); 
	
	@Override
	public void run() {
		for(int i=0; i< 5; i++ ) {
			pauseFor1Sec();
			//			counter.incrementAndGet();
			counter.accumulateAndGet(1, (a,b)->(a+b));
//			counter++;
//			synchronized(counter) {
//				counter++;
//			}
		}
	}

	private void pauseFor1Sec() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Integer getCounter() {
		return counter.get();
	}

	
}
