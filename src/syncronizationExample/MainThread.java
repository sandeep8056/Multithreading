package syncronizationExample;

public class MainThread {

	public static void main(String[] args) {

//		Display dis = new Display();
//
//		ThreadSyncoExample t = new ThreadSyncoExample(dis, "sandeep");
//
//		ThreadSyncoExample t1 = new ThreadSyncoExample(dis, "darshan");
//
//		ThreadSyncoExample t2 = new ThreadSyncoExample(dis, "ashish");
//
//		ThreadSyncoExample t3 = new ThreadSyncoExample(dis, "ashok");
//
//		t.start();
//
//		t1.start();
//		
//		t2.start();
//		
//		t3.start();
		
		
		
		//now create two object 
		
		Display dis1 = new Display();
		Display dis2 = new Display();
		
		ThreadSyncoExample s1 = new ThreadSyncoExample(dis1, "Sandeep");
		ThreadSyncoExample s2 = new ThreadSyncoExample(dis2, "gaurav");
		
		
		s1.start();
		s2.start();
		

	}

}
