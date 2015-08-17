package com.ankush;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleChild {

	
	/*public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		HashMap<Person, String> testMap = new HashMap<Person, String>();
		for(int i = 0; i<100000; i++){
			Person p = new Person();
			p.setId("Ankush"+i);
			testMap.put(p, String.valueOf(i));
		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time to add in HashMap :: " + totalTime);
		
		
		Person p = new Person();
		p.setId("Ankush100");
		
		
		long startTime1 = System.currentTimeMillis();
		testMap.get(p);
		long endTime1   = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Time to search in HashMap :: " + totalTime1);
	}
*/
	
	public static void main(String[] args) throws IOException {
		System.out.println(ExampleChild.calculateHoursFromMilliSeconds(412));;
		System.out.println(ExampleChild.calculateHoursFromMilliSeconds(60412));;
		 
	        }

	 public static String calculateHoursFromMilliSeconds(long totalMilliSeconds) {
	        long totalSeconds = totalMilliSeconds / 1000;
	        long milli = totalMilliSeconds % 1000;
	        long hours = totalSeconds / 3600;
	        long minutes = (totalSeconds % 3600) / 60;
	        long seconds = totalSeconds % 60;
	        return String.format("%02d:%02d.%03d", hours, minutes, seconds, milli);
	    }
	
}
