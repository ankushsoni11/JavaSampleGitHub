package com.ankush.object;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Child extends Parent{
	/*public void execute(){*/
	/*	System.out.println("Child");
		execute2();
	}
	
	public void execute3(){
		System.out.println("Child3");
	}
	
	public void execute2(){
		System.out.println("Child2");
	}*/
	public void execute() throws FileNotFoundException{
		
	}
	public static void main(String[] args) {
		Parent p = new Child();
		//p.execute();
		/*Child c = new Child();
		c.execute2();
		*/
		/*Parent pp = new Parent();
		pp.execute2();*/
		
		CopyOnWriteArrayList<String> ss = new CopyOnWriteArrayList<String>();
		ss.add("Ankush");
		ss.add("Soni");
		 Iterator<String> ilt = ss.iterator();
		 while(ilt.hasNext()){
			 ilt.next();
		 }
	}
}
