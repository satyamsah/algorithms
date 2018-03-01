package abc;

import java.util.Stack;

public class StackUsingRecursion {

	  static Stack<Integer> stack= new Stack<>();
	  
	

	public static void main(String arr[]){
	
	  stack.push(12);
	  stack.push(14);
	  stack.push(12);
	  stack.push(14);
	  reverse();
	  
	}

	private static void reverse() {
	    
	    if(!stack.isEmpty()){
	        int x=stack.peek();
	        stack.pop();
	    	reverse();
	    	insertinBottom(x);
	    }
	    
	
		
	}
	
	private static void insertinBottom( int x){
	
		if(stack.isEmpty()){
			stack.push(x);
			
		}
		else{
			int top=stack.peek();
			stack.pop();
			insertinBottom(x);
			
			
			stack.push(top);
		}
	}
	

}
