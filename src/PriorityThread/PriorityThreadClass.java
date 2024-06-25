package PriorityThread;

public class PriorityThreadClass {
	public static void main(String[] args) {
		
		Thread myThread = new Thread(()-> {
			
			Thread.currentThread().setPriority(2);
			System.out.println("thread priority is set as minimum");
		});
		
		myThread.setPriority(3);
		myThread.start();
System.out.println(		myThread.getPriority());
		
	}
}
