package joinThreadExample;

public class deadLockExampleUsingJoin {

	public static void main(String[] args) {
		
		//main thread is calling it own

		
		try {
		Thread.currentThread().join();
		}catch (InterruptedException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}
}
