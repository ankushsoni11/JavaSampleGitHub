package com.ankush;

public class CountCharacters {
	 public static void main(String[] args){

	        String myString = "aaaaabbbccccccddddw";
	        int count = 1;
	        char temp = 0;
	        String result = "";

	        for(int i = 1; i < myString.length(); i++){
	            temp = myString.charAt(i - 1);

	            if(temp == myString.charAt(i)){
	                count++;
	            }
	            else{
	                result += Character.toString(temp) + "" + count + "";
	                count = 1;
	                if((i+1)==myString.length()){
	                	 result += Character.toString(myString.charAt(i)) + "" + count + "";
	                }
	            }
	        }

	        System.out.println(result);

	    }
}
