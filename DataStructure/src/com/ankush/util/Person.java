/**
 * 
 */
package com.ankush.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author axsoni3
 *
 */
class Person1{
	public void test(){
		
	}
}

public class Person implements Comparator<Person>{
	
	
	private String id;
	
	private String name;
	
	private String job;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public int compare(Person arg0, Person arg1) {
		// TODO Auto-generated method stub
		return arg0.name.compareTo(arg1.name);
	}

	public void testGerneric(ArrayList<? super Object> myList){
		myList.add("Ankush");
	}
	
	public static void main(String[] args) {
					
		double d = 14.000;
		if((d-(int)d)!=0)
		    System.out.println("decimal value is there");
		else
		    System.out.println("decimal value is not there");
		
	}

}
