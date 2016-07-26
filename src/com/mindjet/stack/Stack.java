package com.mindjet.stack;

import java.util.Arrays;

public class Stack {

	private int[] array;
	private int index_top = -1;
	private int length;

	public Stack(int length) {
		
		this.length = length;
		array = new int[length];

	}
	
	public int peek(){
		return array[index_top];
	}
	
	public void clear(){
		
		array = new int[length];
		index_top = -1;
		
	}

	public void push(int i){
		
		if (isFull()) {
			System.out.println("unable to push, the stack is full.");
		}else{
			index_top+=1;
			array[index_top] = i;
		}
		
	}
	
	public int pop(){
		
		return array[index_top--];
		
	}
	
	public void display(){
		
		if (!isEmpty()) {
			System.out.print("Bottom [ ");
			for (int i = 0; i <= index_top; i++) {
				if (i==index_top)
					System.out.print(array[i]);
				else
					System.out.print(array[i]+", ");
			}
			System.out.println(" ] Top");
		}else{
			System.out.println("the stack is empty");
		}
		
	}
	
	public boolean isFull(){
		
		if (index_top == length-1) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean isEmpty(){
		
		if (index_top == -1) {
			return true;
		}else{
			return false;
		}
		
	}
	
	//to verify the match of the separators in the string
	public boolean match(String s){
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (c=='{'||c=='('||c=='[') {
				
				this.push(c);
				
			}else if (c=='}'||c==')'||c==']') {
				
				char temp = (char) this.pop();
				if ((c=='}'&&temp!='{')||(c==')'&&temp!='(')||(c==']'&&temp!='[')) {
					return false;
				}
				
			}
			
		}
		return true;
	}

}
