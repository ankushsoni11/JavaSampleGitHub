/**
 * 
 */
package com.ankush.datastructure;


/**
 * @author axsoni3
 *
 */
public class CheckDataStructure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bag bag = new ArrayBag();
		bag.add("AN");
		bag.add("KU");
		bag.add("SH");
		bag.add("SO");
		bag.add("NI");
		bag.getSize();
		
		System.out.println(bag.getFirst());
		bag.remove("AN");
		bag.remove("SO");
		bag.getSize();
	}

}
