package com.ankush.issues;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class AddDataIntoTheRespository{

	/*public static void main(String[] args) {
		for(Method method : ObjectRepository.class.getMethods()){
			System.out.print(method.getName());
		}
	}*/
	


	    public static void main(String[] args){
	    	List<Integer> list = new ArrayList<Integer>();
	    	for(int i = 0; i<1000; i++)
	    		list.add(i);
	    	
	    	long startTime = System.currentTimeMillis();
	    		list.isEmpty();
	    	long endTime   = System.currentTimeMillis();
	    	long totalTime = endTime - startTime;
	    	System.out.println(totalTime);
	    	
	    	
	    	long startTime2 = System.currentTimeMillis();
	    	CollectionUtils.isNotEmpty(list);
    		long endTime2   = System.currentTimeMillis();
    		long totalTime2 = endTime2 - startTime2;
    		System.out.println(totalTime2);
	    }

	
	
}
