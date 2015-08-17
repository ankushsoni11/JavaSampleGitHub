package com.ankush.threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

	
	public Map<String, String> data = new HashMap<String, String>();
	public ReentrantReadWriteLock reentrantReadWriteLock =  new ReentrantReadWriteLock();
	public Lock readLock = reentrantReadWriteLock.readLock();
	public Lock writeLock = reentrantReadWriteLock.writeLock();
	
	public String readData(String key){
		readLock.lock();
		try{
			return data.get(key);
		}finally{
			readLock.unlock();
		}
	}
}
