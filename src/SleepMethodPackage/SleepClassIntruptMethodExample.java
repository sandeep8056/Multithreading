package SleepMethodPackage;

public class SleepClassIntruptMethodExample  extends Thread {

	
	//if target thread enter to waiting or sleeping state then immediately interupt call will interupt the taarget thread. 	interupt waited until child thread complete 
	@Override
	public void run() {
		
	try {
		for(int i =0;i<10;i++) {
			System.out.println("lazy thread");
			Thread.sleep(2000);
		}
	}catch (InterruptedException e) {
		System.out.println("I got interuption");
	}
	
	}

	
	
	
}
