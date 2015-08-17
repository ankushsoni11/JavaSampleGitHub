/**
 * 
 */
package com.ankush.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author axsoni3
 *
 */
public final class MyImmutableClass{
	private Integer myInteger;
	
	public Integer getMyInteger() {
		return myInteger;
	}

	public String[] getMyStringArray() {
		return myStringArray;
	}

	public HashMap<String, String> getMyMap() {
		//return Collections.unmodifiableMap(myMap);
		return (HashMap<String, String>) myMap.clone(); 
	}

	private String[] myStringArray;
	
	private HashMap<String, String> myMap;
	
	
	private MyImmutableClass(Integer reqInt, String[] reqStringArr, Map<String, String> reqMap){
		this.myInteger = reqInt;
		this.myStringArray = reqStringArr;
		this.myMap = new HashMap<String, String>(reqMap);
	}
	
	public static MyImmutableClass getInstanceOfMyImmutableClass(Integer reqInt, String[] reqStringArr, Map<String, String> reqMap){
		return new MyImmutableClass(reqInt, reqStringArr, reqMap);
	}
	
	public String toString(){
		return myInteger + " - " + Arrays.toString(myStringArray) + " - " +  myMap.toString();
	}
	
}
