package com.ankush.threading;

public class ProducerThead{
	 private Object lock = new Object();

	public void printHello(){
		while(true){
			synchronized (lock) {
				System.out.println("Hello");
				try{
					lock.wait();
					lock.notify();
				}catch(InterruptedException e){
					
				}
				
			}
		}
	}
	
	public void printWorld(){
		while(true){
			synchronized (lock) {
				System.out.println("World");
				try{
					lock.notify();
					lock.wait();
				}catch(InterruptedException e){
					
				}
			}
		}
	}

}