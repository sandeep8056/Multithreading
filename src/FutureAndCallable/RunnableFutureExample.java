package FutureAndCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableFutureExample {
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		Runnable task =()->{
			try {
				System.out.println("Waiting");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		};
		
		Future<?> future = ex.submit(task);
		
		try {
			System.out.println( "future value : "+future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("task complted");
	}

}
