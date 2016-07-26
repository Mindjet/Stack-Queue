package com.mindjet.queue;

public class Test {

	public static void main(String[] args) {
		
		//generate the queue
		Queue queue = new Queue(2);
		
		//enqueue
		queue.enqueue(10);
		queue.enqueue(20);
		
		//error when the queue is full
		queue.enqueue(30);
		
		//display
		queue.display();
		
		//get the item at the head without dequeuing 
		System.out.println(queue.peek());
		
		//dequeue
		queue.dequeue();
		queue.dequeue();
		
		//error when the queue is empty
		queue.dequeue();
		

	}

}
