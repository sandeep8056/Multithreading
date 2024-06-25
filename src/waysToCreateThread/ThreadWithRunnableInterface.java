package waysToCreateThread;

public class ThreadWithRunnableInterface implements Runnable {

	@Override
	public void run() {
	
		//this is my job to be execute in new thread using runnable interface
		
		for(int i=0;i<10;i++) {
			System.out.println("runable child threadd "+i );
		}
	
	}

}
