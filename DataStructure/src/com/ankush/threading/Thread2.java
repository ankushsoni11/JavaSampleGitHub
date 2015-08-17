package com.ankush.threading;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		synchronized (this) {
			while(true){
				System.out.println("World");
				notify();
			}
		}
			
		}

}
