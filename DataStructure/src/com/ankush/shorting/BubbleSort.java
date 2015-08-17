/**
 * 
 */
package com.ankush.shorting;

/**
 * @author axsoni3
	As you can see by watching the BubbleSort Workshop applet with 10 bars, the inner
	and inner+1 arrows make nine comparisons on the first pass, eight on the second,
	and so on, down to one comparison on the last pass. For 10 items, this is
	9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45
	In general, where N is the number of items in the array, there are N-1 comparisons
	on the first pass, N-2 on the second, and so on. The formula for the sum of such a
	series is
	(N–1) + (N–2) + (N–3) + ... + 1 = N*(N–1)/2
	N*(N–1)/2 is 45 (10*9/2) when N is 10.
	Thus, the algorithm makes about N2⁄2 comparisons (ignoring the –1, which doesn’t
	make much difference, especially if N is large).
	There are fewer swaps than there are comparisons because two bars are swapped only
	if they need to be.
		
	Both swaps and comparisons are proportional to N2.
 */
public class BubbleSort {
	
	public int[] bubblesort(int[] intArray){
		int lowerbound = 0;
		int upperbound = intArray.length - 1;
		for(lowerbound = 0; lowerbound<upperbound;){
			while(lowerbound<upperbound){
				if(intArray[lowerbound] > intArray[lowerbound+1]){
					swap(lowerbound, lowerbound+1, intArray);
					lowerbound++;
				}else{
					lowerbound++;
				}
			}
			upperbound--;
			lowerbound = 0;
		}
		
		return intArray;
	}
	
	
	public static void main(String[] args) {
		int[] testBubbleSort =new int[10];
				testBubbleSort[0] = 100;
				testBubbleSort[1] = 34;
				testBubbleSort[2] = 45;
				testBubbleSort[3] = 1;
				testBubbleSort[4] = 8;
				testBubbleSort[5] = 7;
				testBubbleSort[6] = 15;
				testBubbleSort[7] = 50;
				testBubbleSort[8] = 40;
				testBubbleSort[9] = 87;
				
				System.out.println(new BubbleSort().bubblesort(testBubbleSort));
	}
	
	public void swap(int first, int second, int[] intArray){
		int temp = intArray[first];
		intArray[first] = intArray[second];
		intArray[second] = temp;
	}

}
