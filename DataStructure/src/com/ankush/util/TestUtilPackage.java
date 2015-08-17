/**
 * 
 */
package com.ankush.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * @author axsoni3
 *
 */
public class TestUtilPackage {
	
	
	
	
	
	public static void main(String[] args) {
		String[] myStrings = { "One", "Two", "Three" };
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("One", "Get One");
		LinkedList<Integer> linkedListInteger = new LinkedList<Integer>();
		linkedListInteger.add(1);
		
		
	
		MyImmutableClass myImmutableClass = MyImmutableClass.getInstanceOfMyImmutableClass(1, myStrings, myMap);
		System.out.println(myImmutableClass);
		
		tryModification(myImmutableClass.getMyInteger(), myImmutableClass.getMyStringArray(), myImmutableClass.getMyMap());
		System.out.println(myImmutableClass);
	}

	private static void tryModification(Integer reqInt, String[] reqStringArr, Map<String, String> reqMap)    {
		/*reqInt = 10000;        
		reqStringArr = new String[]{ "One", "Two", "Three", "Four" };        
		reqMap.put("Two", "Get Two");
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, null);
		System.out.println(map.size());
		
		Map<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put(null, "1");
		System.out.println(hashtable.size());*/
		
		String s = null;
		System.out.println(s);
		}
}
