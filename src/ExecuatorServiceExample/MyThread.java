package ExecuatorServiceExample;

public class MyThread  implements Runnable{
	
	private int taskId;
	
	 MyThread(int taskId) {
		this.taskId=taskId;
	}

	@Override
	public void run() {
		System.out.println("Task "+taskId + " is running on thread :  "+Thread.currentThread().getName());
		try {
		Thread.sleep(2000);
		
		System.out.println("work done");
	}catch (Exception e) {
		System.out.println(e);
	}

	
	}
	
}
