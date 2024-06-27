package FutureAndCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallAndfutureExample {
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		System.out.println("starting");
		
		Future<Integer>  sum=ex.submit(new Sum(10));
		Future<Double> sqrt =ex.submit(new SquareRoot(16));
		Future<Integer> factorial=ex.submit(new Factorial(5));
		
		try {
			System.out.println(sum.get());
		
		System.out.println(sqrt.get());
		System.out.println(factorial.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.shutdown();
	}

}
