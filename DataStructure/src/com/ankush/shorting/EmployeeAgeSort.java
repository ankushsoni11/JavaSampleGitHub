package com.ankush.shorting;

import java.util.Comparator;

public class EmployeeAgeSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}

}
