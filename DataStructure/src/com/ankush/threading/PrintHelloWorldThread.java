package com.ankush.threading;

public class PrintHelloWorldThread {
	public static void main(String[] args) {
		final ProducerThead thread = new ProducerThead();
		
		Thread thr1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				thread.printHello();
				
			}
		});
		
		
		Thread thr2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				thread.printWorld();
				
			}
		});
		
		thr1.start();
		thr2.start();
		
	}
}
