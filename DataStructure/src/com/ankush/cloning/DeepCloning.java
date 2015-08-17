package com.ankush.cloning;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Vector;

public class DeepCloning {
	
	
	public DeepCloning(){
		
	}
	
	public static Object deepClone(Object o) throws Exception{
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		try{
		 oos = new ObjectOutputStream(bos);
		 oos.writeObject(o);
		 
		 
		 ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
		 return ois.readObject();
		}catch(Exception e){
			throw(e);
		}finally{
			oos.flush();
			//ois.close();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Vector<Person> v1 = new Vector<Person>();
		Person p1 = new Person(1, 1);
		v1.addElement(p1);
		
		System.out.println("Original :: "+ v1.get(0));
		
		String deepCopy = "false";
		if(deepCopy.equals("true")){
			Vector<Person> newVector = (Vector<Person>)DeepCloning.deepClone(v1);
			System.out.println("New :: "+ newVector.get(0));
			
			p1.x = 2;
			p1.y = 2;
			
			System.out.println("Original :: "+ v1.get(0));
			System.out.println("New :: "+ newVector.get(0));
		}if(deepCopy.equals("false")){
			Vector<Person> newVector = (Vector<Person>)v1.clone();
			System.out.println("New :: "+ newVector.get(0));
			
			p1.setX(2);
			p1.setY(2);
			
			System.out.println("Original :: "+ v1.get(0));
			System.out.println("New :: "+ newVector.get(0));
		}
		
	}

}

class Person implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int y;
	
	public Person(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	 public String toString() {
	        return "x :: "+x+" y :: "+y;
	    }
	 
	 public  Object clone() {
		 return new Person(x, y);
	 }

}
