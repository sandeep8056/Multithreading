package yieldMethodPackage;

public class Main {

	public static void main(String[] args) {
		
		
		
		MyThreadYeildDemo thread = new MyThreadYeildDemo();
		
		Thread t = new  Thread(thread);
		
		t.start();
		
		for(int i =0;i<10;i++) {
			System.out.println("Main thread called "+i);
		}
		
	}
}
