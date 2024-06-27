package ExecuatorServiceExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuatorExample {
	
	public static void main(String[] args) {
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		for(int i =1;i<10;i++) {
			ex.execute(new MyThread(i));
		}
		
		ex.shutdown();
	}

}
