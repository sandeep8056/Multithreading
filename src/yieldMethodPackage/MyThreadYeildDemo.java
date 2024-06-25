package yieldMethodPackage;

public class MyThreadYeildDemo implements Runnable{

	@Override
	public void run() {
		//yield method pause his process and then thread schedular schedule another thread if priority high or same of parent thread
		
		for(int i =0;i<10;i++) {
			
			System.out.println("thread call of yield");
			Thread.yield();
		}
	}

}
