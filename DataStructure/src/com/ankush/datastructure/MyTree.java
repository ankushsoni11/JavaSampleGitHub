package com.ankush.datastructure;


public class MyTree<K,V> {
	
	
	public class Entry<K,V>{
		K key;
		V value;
		Entry<K,V> left = null;
		Entry<K,V> right = null;
		Entry<K,V> parent = null;
		
		 Entry(K key, V value, Entry<K,V> parent){
			this.key = key;
			this.value = value;
			this.parent = parent;
		}
	}

}
