package com.ankush.threading;

public class HelloWorldExample {
	public synchronized void printHello(){
		System.out.println("Hello");
	}
	
	public synchronized void printWorld(){
		System.out.println("World");
	}
}
