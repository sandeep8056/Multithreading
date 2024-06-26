package Synchronizers.PhaserPackage;

import java.util.concurrent.Phaser;

public class MyThread {
	
	Phaser phaser;
	
	String name;
	
	public MyThread(Phaser phaser,String name) {
		this.phaser=phaser;
		this.name = name;
		
		this.phaser.register();
		new Thread(r1).start();
	}

	Runnable r1= ()->{
		System.out.println("Thread "+name+" Beginning of phase 1");
		phaser.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(2000);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread"+name+" Begining of phase 2");
		phaser.arriveAndAwaitAdvance();
		
		
		
		try {
			Thread.sleep(2000);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Thread"+name+" Begining of phase 3");
		phaser.arriveAndDeregister();
		
		
	};
	
	
}
