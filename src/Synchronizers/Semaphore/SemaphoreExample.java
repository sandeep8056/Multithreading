package Synchronizers.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	
	public static void main(String[] args) {
		
		
		Semaphore sem = new Semaphore(1);
		
		IncrementCounter in = new IncrementCounter("A", sem);
		DecrementCounter d = new DecrementCounter("B", sem);
		
	}

}
