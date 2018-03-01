package naive;


import java.util.Stack;

public class ImplementQueueUsing2Stack {


	Stack<Integer> stack1= new Stack<>();
	Stack<Integer> stack2= new Stack<>();

	
	void add(int abc){
	 stack1.push(abc);
	}
	
	private void swaptoSecondStack(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}
	
	void remove(){
		swaptoSecondStack();
		stack2.pop();
	}
	
	int peek()
	{
		return stack2.peek();
	}
	public static void main(String[] args) {
	
	ImplementQueueUsing2Stack queue = new ImplementQueueUsing2Stack();
	queue.add(12);
	queue.add(14);
	queue.add(2);
	queue.add(33);
	queue.add(22);
	queue.add(4);
	queue.add(24);
	queue.add(33);
	queue.remove();
	queue.remove();
	System.out.println(queue.peek());
	
	
	
	}

}
