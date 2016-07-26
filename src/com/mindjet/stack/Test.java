package com.mindjet.stack;

public class Test {

	public static void main(String[] args) {

		
		//generate stack
		Stack stack = new Stack(2);
		
		//push
		stack.push(10);
		stack.push(20);
		
		//error when the stack is full
		stack.push(30);
		
		//get the item on the top without popping
		stack.peek();
		
		//pop
		stack.pop();
		
		//display the stack
		stack.display();
		
		//clear the stack
		stack.clear();
		
		//string matching verification
		stack = new Stack(10);
		stack.match("(asdasd{}dasdas[asdads])"); 	// return true
		stack.match("asdasd[]asdads{dsadsa)");		// return false
		
		
	}

}
