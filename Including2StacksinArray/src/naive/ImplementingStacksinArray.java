package naive;

import java.util.Stack;



public class ImplementingStacksinArray {

	class Node
	{
		Node next=null;
		int data;
		
		public Node( int data){
		this.data=data;	
		}
	}
	
	public static void main(String[] args) {
	
		Stack<Integer> stack1= new Stack<>();
		Stack<Integer> stack2= new Stack<>();
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		

		for(int i=0;i<arr.length/2;i++){
			stack1.push(arr[i]);
		}
		stack1.push(33);
	
		for(int i=arr.length/2;i<arr.length;i++){
			stack2.push(arr[i]);
		}
		//System.out.println(stack1.size());
		//System.out.println(stack2.size());
		display(stack1);
		display(stack2);
	}

	private static void display(Stack<Integer> stack) {
		
		while(stack.empty()!=true){
			
			System.out.println(stack.pop());
			//System.out.println("stacksize"+stack.size());
			}
	
	

	}
}
