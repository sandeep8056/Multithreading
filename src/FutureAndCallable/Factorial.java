package FutureAndCallable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
	
	int n;
	
	public Factorial(int n){
		this.n=n;
	}
	
	@Override
	public Integer call() throws Exception {
		int fact =1;
		for(int i=n;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}

}
