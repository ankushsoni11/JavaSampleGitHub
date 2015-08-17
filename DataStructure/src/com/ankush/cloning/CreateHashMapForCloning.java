package com.ankush.cloning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.ankush.collection.Person;

public class CreateHashMapForCloning {
	
	/*public static Map<Person, Integer> getThePersonHashmap(){
		Map<Person, Integer> personMap = new HashMap<Person, Integer>();
		for(int i = 100; i>0; i--){
			Person p = new Person();
			p.setId(i);
			personMap.put(p, i);
		}
		
		return personMap;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\axsoni3\\Desktop\\build\\test.ser");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(CreateHashMapForCloning.getThePersonHashmap());
		objectOutputStream.flush();
		
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\axsoni3\\Desktop\\build\\test.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		HashMap<Person, Integer> map = (HashMap<Person, Integer>)objectInputStream.readObject();
		
		System.out.println(map);
		
		Person p = new Person();
		p.setId(100);
		System.out.println(map.get(p));
	}*/
	
	/*public static HashMap<Person, String> serializedMap(HashMap<Person, String> map) throws IOException, ClassNotFoundException{
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\axsoni3\\Desktop\\build\\test.ser");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(map);
		objectOutputStream.flush();
		
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\axsoni3\\Desktop\\build\\test.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		HashMap<Person, String> Clonedmap = (HashMap<Person, String>)objectInputStream.readObject();
		
		return Clonedmap;
	}
	
	public static HashMap<Person, String> getTheClonedMap(HashMap<Person, String> map) throws IOException, ClassNotFoundException{
		return (HashMap<Person, String>)map.clone();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person();
		p1.setId("Aa");
		
		Person p2 = new Person();
		p2.setId("BB");
		
		HashMap<Person, String> hashMap = new HashMap<Person, String>();
		hashMap.put(p1, p1.getId());
		hashMap.put(p2, p2.getId());
		
		System.out.println(hashMap.get(p1));
		HashMap<Person, String> SerializedhashMap = CreateHashMapForCloning.serializedMap(hashMap);
		System.out.println(SerializedhashMap.get(p1));
		HashMap<Person, String> ClonedhashMap = CreateHashMapForCloning.serializedMap(hashMap);
		System.out.println(ClonedhashMap.get(p1));
		
	}*/
	
	public static int Test(){
		return new Integer(1);
	}
	public static Integer Test1(){
		return 1;
	}
	
	
	
}
