package ExecuatorServiceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolExample {
	
	public static void main(String[] args) {
		
ScheduledExecutorService ex= Executors.newScheduledThreadPool(3);

ex.scheduleAtFixedRate(new MyThread(9), 3, 1, TimeUnit.SECONDS);
		
		
		
	}

}
