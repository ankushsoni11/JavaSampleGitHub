package com.ankush.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostFixExpression {
	
	public static Stack<String> integerStack;
	public static List<String> outputString;
	public PostFixExpression(){
		integerStack = new Stack<String>();
		outputString = new ArrayList<String>();
	}
	public void getPostFixExpression(String inputString){// String is expected to be space seperated.
		String[] stringArr = inputString.split(" ");
		for(int index = 0; index<stringArr.length; index++){
			try{
				int i = Integer.valueOf(stringArr[index]);
				outputString.add(String.valueOf(i));
			}catch(NumberFormatException e){
				char c = stringArr[index].charAt(0);
				int incomingOperator  = this.precedenceLevel(c);
				String popedElement;
				int popedElementOpeator;
				if(!integerStack.empty()){
					 popedElement = integerStack.pop();
					 popedElementOpeator = this.precedenceLevel(popedElement.charAt(0));
						if(popedElementOpeator>=incomingOperator){
							outputString.add(popedElement);
							integerStack.push(stringArr[index]);
						}else{
							integerStack.push(popedElement);
							integerStack.push(stringArr[index]);
						}
				}else{
					integerStack.push(stringArr[index]);
				}
			
			}
			
		}
		
		while(!integerStack.empty()){
			outputString.add(integerStack.pop());
		}
		
	}
	
	public int calculatePostFixExpression(List<String> list){
		for(String cha : list){
			try{
				int i = Integer.valueOf(cha);
				integerStack.push(String.valueOf(i));
			}catch(NumberFormatException e){
				int num2 =  Integer.valueOf(integerStack.pop());
				int num1 =  Integer.valueOf(integerStack.pop());
				int finalN = this.cal(cha.charAt(0), num1, num2);
				integerStack.push(String.valueOf(finalN));
				 
			}
		}
		return Integer.valueOf(integerStack.pop());
		
	}
	
	int  cal(char op, int num1, int num2){
		 switch (op) {
	        case '+':
	        	return num1 + num2;
	        case '-':
	            return num1 - num2;
	        case '*':
	        	 return num1 * num2;
	        case '/':
	            return num1/num2;
	        case '^':
	            return num1 ^ num2;
	        case '(':
	        	return 3;
	        case ')':
	        	return 4;
	        default:
	            throw new IllegalArgumentException("Operator unknown: " + op);
	    }
	}
	int precedenceLevel(char op) {
	    switch (op) {
	        case '+':
	        case '-':
	            return 0;
	        case '*':
	        case '/':
	            return 1;
	        case '^':
	            return 2;
	        case '(':
	        	return 3;
	        case ')':
	        	return 4;
	        default:
	            throw new IllegalArgumentException("Operator unknown: " + op);
	    }
	}

	
	public static void main(String[] args) {
		PostFixExpression postFixExpression = new PostFixExpression();
		postFixExpression.getPostFixExpression("10 + 3 - 5 * 6 / 5");
		System.out.println(postFixExpression.outputString);
		System.out.println(postFixExpression.calculatePostFixExpression(outputString));
	}
}
