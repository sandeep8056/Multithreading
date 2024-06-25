package SleepMethodPackage;

public class MainThread {

	public static void main(String[] args) {
		
		
		SleepClassIntruptMethodExample thread = new SleepClassIntruptMethodExample();
		
		
		thread.start();
		
		thread.interrupt();   //main thread interupting the child thread
		
		System.out.println("main thread");
		
	}
}
