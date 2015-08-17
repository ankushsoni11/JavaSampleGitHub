package com.ankush.datastructure;

public class CustomStack {
	
	char[] stackArray;
	int maxsize;
	int top;
	
	public CustomStack(int count){
		maxsize = count;
		stackArray = new char[count];
		top = -1;
	}

	
	public void pushing(char item) throws Exception{
		if(top>=maxsize){
			throw new Exception("Stack is full");
		}else{
			stackArray[++top] = item;
		}
			
	}
	
	public char popping() throws Exception{
		if(top==-1){
			throw new Exception("Stack is empty");
		}else{
			char temp = stackArray[top];
			stackArray[top] = 0;
			top--;
			  return temp;
		}
	}
	
	/*public static void main(String[] args) throws Exception {
		CustomStack customerStack = new CustomStack(5);
		customerStack.pushing('A');
		customerStack.pushing('N');
		customerStack.pushing('K');
		customerStack.pushing('U');
		customerStack.pushing('S');
		System.out.println(customerStack.popping());
		System.out.println(customerStack.popping());
		System.out.println(customerStack.popping());
		System.out.println(customerStack.popping());
		System.out.println(customerStack.popping());
		System.out.println(customerStack.popping());
	}*/
	
	
}
