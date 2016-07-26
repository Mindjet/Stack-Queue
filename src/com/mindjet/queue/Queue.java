package com.mindjet.queue;

public class Queue {
	
	private int[] array;
	private int front = 0;
	private int rear = 0;
	private int length;
	
	public Queue(int length){
		
		this.length = length;
		array = new int[length];
		
	}
	
	public void enqueue(int i){
		
		if (!isFull()) {
			array[rear++] = i;
		}else{
			System.out.println("unable to enqueue, cuz the queue is full.");
		}
		
	}
	
	public void dequeue(){
		
		if (!isEmpty()) {
			front++;
		}else{
			System.out.println("unable to dequeue, cuz the queue is empty");
		}
		
	}
	
	public int peek(){
		
		return array[front];
		
	}
	
	public boolean isFull(){
		
		if (rear == length) {
			return true;
		}
		return false;
		
	}
	
	public boolean isEmpty(){
		
		if (front==rear) {
			return true;
		}
		return false;
		
	}
	
	public void display(){
		
		System.out.print("head[ ");
		
		for (int i = front; i < rear; i++) {
			
			if (i==rear-1) 
				System.out.print(array[i]);
			else
				System.out.print(array[i]+", ");
		}
		
		System.out.println(" ]tail");
		
	}
	

}
