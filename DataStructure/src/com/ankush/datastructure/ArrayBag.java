/**
 * 
 */
package com.ankush.datastructure;

/**
 * @author axsoni3
 *
 */
public class ArrayBag implements Bag{
	
	private Object[] object = new Object[1000];
	private int size, i;

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		if(size>0)
			return object[i];
		return null;
	}

	@Override
	public Bag getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Object removeObject) {
		// TODO Auto-generated method stub
		for(int j = 0; j<size; j++){
			if(object[j]==removeObject){
				System.arraycopy(object, j+1, object, j, size-j-1);
			}
		}
		object[--size] = null;
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		object[size++] = o;
		
	}

}
