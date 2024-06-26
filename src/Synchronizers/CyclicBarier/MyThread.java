package Synchronizers.CyclicBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyThread {

	
	String name;
	
	CyclicBarrier cbar;
	
	public MyThread(String name , CyclicBarrier cbar) {
		this.cbar=cbar;
		this.name=name;
		new Thread(r1).start();
		
		
	}
	
	
	Runnable r1 = ()-> {
		System.out.println(name);
		try {
			cbar.await(5,TimeUnit.SECONDS );
		} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
			throw new RuntimeException(e);
		
		}
	};
	
}
