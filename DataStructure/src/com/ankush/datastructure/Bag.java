/**
 * 
 */
package com.ankush.datastructure;

/**
 * @author axsoni3
 *
 */
public interface Bag {
	public Integer getSize();
	public Object getFirst();
	public Object getNext();
	public void remove(Object removeObject);
	public void add(Object o);
}
