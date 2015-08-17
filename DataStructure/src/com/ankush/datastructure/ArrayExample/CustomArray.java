package com.ankush.datastructure.ArrayExample;

public class CustomArray {
	
	public static long[] playerArray;
	public static int eleIndex = 0;
	public static int size = 0;
	public static int currentIndex;
	
	public CustomArray(int arrayLength){
		playerArray = new long[arrayLength];
	}
	
	public void insert(long o){
		if(size==0){
			playerArray[eleIndex] = o;
			eleIndex++;
			size++;
		}else{
			int temSize = size;
			int index = 0;
			while(temSize == size){
				if(o < playerArray[index]){
					for(int maxIndex = size; maxIndex>index; maxIndex--){
						playerArray[maxIndex] = playerArray[maxIndex-1];
					}
					playerArray[index] = o;
					eleIndex++;
					size++;
				}else{
					index++;
					if(index == temSize){
						playerArray[index] = o;
						eleIndex++;
						size++;
					}
				}
			}
		}
	}
	
	public boolean find(long o){
		for(currentIndex = 0; currentIndex<size; currentIndex++)
			if(playerArray[currentIndex]==o || playerArray[currentIndex]>o)
				break;
		
		if(size==currentIndex || playerArray[currentIndex]>o){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean delete(long o){
		if(size==0)
			return false;
		for(currentIndex = 0; currentIndex<size; currentIndex++)
			if(playerArray[currentIndex]==o)
				break;
		if(size==currentIndex){
			return false;
		}else{
			int k;
			for(k = currentIndex; k<size-currentIndex-1; k++)
				playerArray[k] = playerArray[k+1];
				
				playerArray[k] = 0;
				size--;
				eleIndex--;
				return true;
		}
	}
	
	public StringBuffer print(){
		StringBuffer elements = new StringBuffer();
		elements.append("[");
		for(currentIndex = 0; currentIndex<size; currentIndex++){
			elements.append(playerArray[currentIndex]+" , ");
		}
		elements.append("]");
		
		return elements;
	}
	
	public void get(int index){
		System.out.println(playerArray[index]);
	}
	
	public boolean find2(long n){
		int lowerbound = 0;
		int upperbound = size-1;
		int curInd;
		while(true){
			curInd = (lowerbound + upperbound)/2;
			if(playerArray[curInd]==n)
				return true;
			else if(lowerbound >  upperbound)
				return false;
			else{
				if(playerArray[curInd] < n)
					lowerbound = curInd + 1;
				else
					upperbound = curInd - 1;
				
			}
		}
	}

}
