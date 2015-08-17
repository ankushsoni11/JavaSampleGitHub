package com.ankush.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shift {

	public static void main(String[] args) {
		/*List<Integer> listOfInt = new ArrayList<Integer>();
		listOfInt.add(10);
		listOfInt.add(4);
		listOfInt.add(60);
		listOfInt.add(8);
		listOfInt.add(15);
		listOfInt.add(4);
		listOfInt.add(77);
		listOfInt.add(17);
		listOfInt.add(9);
		listOfInt.add(65);
		listOfInt.add(34);
		listOfInt.add(88);
		listOfInt.add(3);
		
		Shift.mergeSort(listOfInt.toArray(), listOfInt.toArray(), 0, listOfInt.size(), 0);*/
		//System.out.println(4<<1);
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(13, "Thirteen");
		treeMap.put(14, "Fouteen");
		treeMap.put(12, "Twelve");
		treeMap.put(11, "eleven");
		treeMap.put(17, "Seventeen");
		
	}
	
	
	 private static void mergeSort(Object[] src,
			  Object[] dest,
			  int low,
			  int high, int off) {
		int length = high - low;

		// Insertion sort on smallest arrays
		if (length < 7) {
			for (int i = low; i < high; i++)
				for (int j = i; j > low
						&& ((Comparable) dest[j - 1]).compareTo(dest[j]) > 0; j--)
					swap(dest, j, j - 1);
			return;
		}

		// Recursively sort halves of dest into src
		int destLow = low;
		int destHigh = high;
		low += off;
		high += off;
		int mid = (low + high) >>> 1;
		mergeSort(dest, src, low, mid, -off);
		mergeSort(dest, src, mid, high, -off);

		// If list is already sorted, just copy from src to dest. This is an
		// optimization that results in faster sorts for nearly ordered lists.
		if (((Comparable) src[mid - 1]).compareTo(src[mid]) <= 0) {
			System.arraycopy(src, low, dest, destLow, length);
			return;
		}

		// Merge sorted halves (now in src) into dest
		for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
			if (q >= high || p < mid
					&& ((Comparable) src[p]).compareTo(src[q]) <= 0)
				dest[i] = src[p++];
			else
				dest[i] = src[q++];
		}
	}
	 
	  private static void swap(Object[] x, int a, int b) {
			Object t = x[a];
			x[a] = x[b];
			x[b] = t;
		    }
}
