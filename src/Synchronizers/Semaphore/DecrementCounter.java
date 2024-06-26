package Synchronizers.Semaphore;

import java.util.concurrent.Semaphore;

public class DecrementCounter {
	
	String name;
	
	Semaphore sem;
	
	public DecrementCounter(String name ,Semaphore sem) {
		this.name= name;
		this.sem=sem;
		new Thread(r2).start();
	}
	
	Runnable r2 = ()-> {
		try {
		System.out.println(name +" waiting to get permit");
		sem.acquire();
		System.out.println(name +"thrad got permit to access");
		
		for(int i =1;i<10;i++) {
			SharedResource.counter--;
			System.out.println(name +" : "+SharedResource.counter);
			Thread.sleep(20);

		}
		
		}catch( InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(name +"realse the permit.");
		sem.release();
	};
	

}
