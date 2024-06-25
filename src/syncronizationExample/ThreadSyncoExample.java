package syncronizationExample;

public class ThreadSyncoExample  extends Thread{

	Display display;
	
	String name;
	
	
	
	
	public ThreadSyncoExample(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}




	@Override
	public void run() {
		
		display.wish(name);
		
	}

	
	
	
	
}
