package com.ankush.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class TestSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		new TestSingleton().breakSingletonBySerialization();
	}

	public void breakSingletonByReflection() throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		MySingletonClass instance1 = MySingletonClass.getNewInstance();
		MySingletonClass instance2 = null;
		
		
		Constructor[] constructors = MySingletonClass.class.getConstructors();
		for(Constructor c: constructors){
			c.setAccessible(true);
			instance2 = (MySingletonClass)c.newInstance();
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
	
	public void breakSingletonBySerialization(){
		MySingletonClass instance1 = MySingletonClass.getNewInstance();
		MySingletonClass instance2 = null;
		try{
		ObjectOutput output = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\axsoni3\\Desktop\\GPON\\text.ser")));
		output.writeObject(instance1);
		output.close();
		
		
		ObjectInput input = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\axsoni3\\Desktop\\GPON\\text.ser")));
		instance2 = (MySingletonClass)input.readObject();
		input.close();
		}catch(Exception e){
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		
	}
}
