package syncronizationExample;

public class Display {

	public static synchronized void  wish(String name) {
		
		System.out.println("good morning" +name );
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("good evening" +name );
	}
}
