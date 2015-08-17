package com.ankush.util;

import java.io.Serializable;

public class MySingletonClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8683036289291983318L;
	private static volatile MySingletonClass newInstance;
	
	
	public static MySingletonClass getNewInstance(){
		MySingletonClass result = newInstance;
		if(result==null){
			synchronized (MySingletonClass.class) {
				result = newInstance;
				if(result==null){
					newInstance = result  = new MySingletonClass();
				}
			}
			
		}
		return newInstance;
	}
	
	protected Object readResolve(){
		return	getNewInstance();
	}

}
