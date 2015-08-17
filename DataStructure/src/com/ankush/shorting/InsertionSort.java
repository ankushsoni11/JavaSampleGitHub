package com.ankush.shorting;

public class InsertionSort {
	public int[] insertionSort(int[] intArray){
		
		int in, out;
		for(out = 1; out<intArray.length; out++){
			int temp = intArray[out];
			in = out;
			while(in>0 && intArray[in-1]>temp){
				intArray[in] = intArray[in-1];
				--in;
			}
			intArray[in] = temp;
		}
		
		return intArray;
	}
	
	public static void main(String[] args) {
		int[] testInsertionSort =new int[10];
				testInsertionSort[0] = 100;
				testInsertionSort[1] = 34;
				testInsertionSort[2] = 45;
				testInsertionSort[3] = 1;
				testInsertionSort[4] = 8;
				testInsertionSort[5] = 7;
				testInsertionSort[6] = 15;
				testInsertionSort[7] = 50;
				testInsertionSort[8] = 40;
				testInsertionSort[9] = 87;
				
				System.out.println(new InsertionSort().insertionSort(testInsertionSort));
	}
}
