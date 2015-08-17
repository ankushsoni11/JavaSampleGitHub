package com.ankush.threading;

public class Thread1 extends Thread{

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
		//t.run();
	}

	@Override
	public void run() {
		System.out.println("finally");
	}
}
