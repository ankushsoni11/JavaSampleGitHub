package com.ankush.datastructure.ArrayExample;

public class TestingArray {

	public static void main(String[] args) {
		
		CustomArray customerArray = new CustomArray(10);
		customerArray.insert(100);
		customerArray.insert(51);
		customerArray.insert(71);
		customerArray.insert(75);
		customerArray.insert(110);
		System.out.println(customerArray.print());
		
		System.out.println(customerArray.size);
		System.out.println(customerArray.find2(13));
		System.out.println(customerArray.find2(100));
		//customerArray.delete("12");
		System.out.println(customerArray.size);
		System.out.println(customerArray.print());
		
		customerArray.get(1);
	}
}
