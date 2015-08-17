package com.ankush.threading;

public class TestHelloWorld {
	
	public static void main(String[] args) {
		final HelloWorldExample helloWorld = new HelloWorldExample();
		
		Thread helloThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (helloWorld) {
					while(true){
						try {
							helloWorld.printHello();
							helloWorld.wait();
							helloWorld.notify();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}
		});
		
		Thread worldThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (helloWorld) {
					while(true){
						try {
							helloWorld.printWorld();
							helloWorld.notify();
							helloWorld.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
			}
		});
		
		helloThread.start();
		worldThread.start();
	}

}
