package FutureAndCallable;

import java.util.concurrent.Callable;

public class SquareRoot  implements Callable<Double>{

	double num;
	
	public SquareRoot(double num) {
		this.num=num;
	}
	
	@Override
	public Double call() throws Exception {
		
		return Math.sqrt(num);
		
	}

	
}
