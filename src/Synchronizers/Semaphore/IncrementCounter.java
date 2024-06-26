package Synchronizers.Semaphore;

import java.util.concurrent.Semaphore;

public class IncrementCounter {
	
	String name;
	
	Semaphore sem;
	
	IncrementCounter(String name,Semaphore sem){
		this.name=name;
		this.sem=sem;
		new Thread(r1).start();
	}
	
	
	Runnable r1 = ()->{
		
		try {
		System.out.println(name +"is waiting for thread");
		
		sem.acquire();
		
		System.out.println(name +" get acccess ");
		
		for(int i =0;i<10;i++) {
			SharedResource.counter++;
			System.out.println(name +" : "+SharedResource.counter);
			Thread.sleep(20);
			
		}
		
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println(name +"realse the permit.");
		sem.release();
		
		
	};
	
	
	
	
	

}
