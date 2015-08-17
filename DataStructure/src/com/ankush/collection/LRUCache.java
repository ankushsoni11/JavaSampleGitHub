package com.ankush.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<String, String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int size;
	
	private LRUCache(int size){
		super(size, 0.75f, true);
		this.size = size;
	}

	public static <K, V> LRUCache<K, V> newInstance(int size){
		return new LRUCache<K,V>(size);
	}
	
	public void setMax(int size){
		this.size = size;
	}
	
	@Override
	 protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size()>size;
    }
	
	public static void main(String[] args) {
		LRUCache<String, String> lruCache = LRUCache.newInstance(2);
		/*lruCache.put("1", "1");
		lruCache.put("2", "2");
		lruCache.put("3", "3");*/
		
		HashMap<String, String> map = new HashMap<String, String>(10000000);
		map.put("Stbncccccccccccring", "Stcvncvnbgnjring");
		
		
	}
	
}
