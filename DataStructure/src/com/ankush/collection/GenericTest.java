package com.ankush.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	
	
	public static void get(List<? extends Number> tt){
		
	}
	
	public static void get2(List<? super Number> tt){
			
		}
	
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		GenericTest.get(integerList);
		
		List<Serializable> integerSerializable = new ArrayList<Serializable>();
		GenericTest.get2(integerSerializable);
	}
}
