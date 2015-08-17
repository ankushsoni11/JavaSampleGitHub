/**
 * 
 */
package com.ankush.shorting;

/**
 * @author axsoni3
 *
 */
public class SelectionSort {
	
	public int[] selectionSort(int[] intArray){
		int lowerbound = 0;
		int upperbound = intArray.length - 1;
		for(int outer = lowerbound; outer<upperbound; outer++){
			for(int inner = outer+1; inner<=upperbound; inner++){
				if(intArray[outer]>intArray[inner]){
					swap(outer, inner, intArray);
				}
			}
		}
		
		return intArray;
	}
	
	public void swap(int first, int second, int[] intArray){
		int temp = intArray[first];
		intArray[first] = intArray[second];
		intArray[second] = temp;
	}
	
	public static void main(String[] args) {
		int[] testSelectionSort =new int[10];
				testSelectionSort[0] = 100;
				testSelectionSort[1] = 34;
				testSelectionSort[2] = 45;
				testSelectionSort[3] = 1;
				testSelectionSort[4] = 8;
				testSelectionSort[5] = 7;
				testSelectionSort[6] = 15;
				testSelectionSort[7] = 50;
				testSelectionSort[8] = 40;
				testSelectionSort[9] = 87;
				
				System.out.println(new SelectionSort().selectionSort(testSelectionSort));
	}
	

}
