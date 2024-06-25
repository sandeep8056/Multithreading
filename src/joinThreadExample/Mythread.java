package joinThreadExample;

public class Mythread implements Runnable {

	
// join method if andy thread want to wait for another thread then that which want to wait must call the another htread with another one 
	
	
	//whiile  a thread is waiting any other thread interupt then it throws interupted exxeption it is checked expectatuon
	
	
	static Thread mt;
	
	@Override
	public void run() {
	
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	for(int i =0;i<10;i++) {
		
		System.out.println("Child Thread");
		try {
		
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
	
}
