package Synchronizers.CountDownLatchPac;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
	
	public static void main(String[] args) {
		
		
		CountDownLatch latch = new CountDownLatch(4);
		
		for(int i =0;i<3;i++) {
			new Thread(()->{
				System.out.println("Task completed by thread "+Thread.currentThread().getId());
				latch.countDown();
			}).start();
		}
		
		try {
			latch.await(10,TimeUnit.SECONDS);
			System.out.println("All task is completed now go to next step");
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
