package Synchronizers.ExchangerPackage;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
	
	public static final Exchanger<String> exchanger = new Exchanger<>();
	
	public static void main(String[] args) {
		
		
		Thread t1 =new Thread(()->{
			exchangeData("thread 1 : sending Data", "data from Thread 1");
		});
		
		Thread t2 = new Thread(()-> {
			exchangeData("thread 2 : sending data", "data from Thread 2");
		});
		
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();
		}catch (InterruptedException e) {
		 throw new RuntimeException(e);	
		}
	}
	
	private static void exchangeData(String message , String dataToSend) {
		
		try {
		System.out.println(message +"  "+dataToSend);
		
		String receiveData = exchanger.exchange(dataToSend);
		
		System.out.println(message +" : Recieved "+receiveData);
		
		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
