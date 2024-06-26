package Synchronizers.CyclicBarier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarierExample {
	public static void main(String[] args) {
		
		CyclicBarrier cb =new CyclicBarrier(3,()->{
			System.out.println("Barrier Reached");
		});
		
		System.out.println("Starting ......");
		
		new MyThread("A", cb);
		new MyThread("B", cb);

		new MyThread("C", cb);
		
		
	}

}
