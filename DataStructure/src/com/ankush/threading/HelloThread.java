package com.ankush.threading;

public class HelloThread implements Runnable{
	
	ProducerThead thread;
	
	public HelloThread(ProducerThead thread){
		this.thread = thread;
	}
	public void run() {
		synchronized (thread) {
				try{
					thread.notify();
					System.out.println("Hello");
					thread.wait();
				}catch(InterruptedException e){
					
			}
		}
	}

}
