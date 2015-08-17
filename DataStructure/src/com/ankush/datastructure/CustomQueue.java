package com.ankush.datastructure;

public class CustomQueue {
	
	int front, rear;
	int[] queue;
	int queueSize;
	
	public CustomQueue(int queueSize){
		queue = new int[queueSize];
		front = 0;
		rear = -1;
		this.queueSize = queueSize;
	}
	
	public void add(int element) throws Exception{
		if(rear == this.queueSize-1){
			throw new Exception("Queue is Full");
		}else{
			queue[++rear] = element;
		}
	}
	
	public int remove() throws Exception{
		if(front>rear){
			throw new Exception("Queue is Empty");
		}else{
			int temp = queue[front];
			queue[front] = 0;
			front++;
			return temp;
		}
	}
	
	public static void main(String[] args) throws Exception {
		/*CustomQueue queue = new CustomQueue(2);
		queue.add(1);
		queue.add(2);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		queue.add(1);*/
		
		for(int i = 10; i>0; i--){
			System.out.println(i);
		}
		
	}

}
