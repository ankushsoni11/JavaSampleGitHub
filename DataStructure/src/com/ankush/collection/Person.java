package com.ankush.collection;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 101;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	
	
}
