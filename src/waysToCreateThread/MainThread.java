package waysToCreateThread;

public class MainThread {
	
	public static void main(String[] args) {
		
		TheadClassExample t = new TheadClassExample();
		
	Thread.currentThread().setName("Pawan Kalyan");
	System.out.println(Thread.currentThread());	
		t.start();
		
		ThreadWithRunnableInterface runableThread = new ThreadWithRunnableInterface();
		
		
		Thread t1 = new Thread(runableThread);
		
		
		Thread t2 = new Thread(()->{
			for(int i =0;i<2;i++) {
				System.out.println("this thread is using lambda"+Thread.currentThread());
			}
		});
		
		t2.start();
		
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread call "+i);
		}
		
		
		
		
	}

}
