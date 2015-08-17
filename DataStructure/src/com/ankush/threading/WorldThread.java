package com.ankush.threading;

public class WorldThread implements Runnable{
	ProducerThead thread;
	
	public WorldThread(ProducerThead thread){
		this.thread = thread;
	}
	
	public void run() {
		synchronized (thread) {
			while(true){
				try{
					
					thread.notify();
					System.out.println("World");
					thread.wait();
					Thread.sleep(1000);
				}catch(InterruptedException e){
					
				}
			}
		}
	}

}

