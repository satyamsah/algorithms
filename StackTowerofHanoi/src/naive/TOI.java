package naive;

import naive.ImplStack.Node;

public class TOI {
	
	public static void main(String args[]){
		TOI toi= new TOI();
		ImplStack stack1= new ImplStack();
		stack1.push(12345);
		stack1.push(1234);
		stack1.push(123);
		stack1.push(12);
		stack1.push(1);
		stack1.push(-1);
		stack1.push(-2);
		System.out.println("--");
		System.out.println(stack1.size());

		ImplStack stack2= new ImplStack();
		ImplStack stack3= new ImplStack();
		System.out.println(stack1.hashCode());
		
		toi.implementTOI(stack1,stack2,stack3);
		
		System.out.println(stack3.size());
		System.out.println("--");
		display(stack3);
		
	}

	private static void display(ImplStack stack) {
		Node runner=stack.top;
		while(runner!=null){
			System.out.println(runner.data);
			runner=runner.next;
		}
		
	}

	public  ImplStack implementTOI(ImplStack stack1, ImplStack stack2, ImplStack stack3) {
		//System.out.println(stack1.hashCode());
		//System.out.println(stack1.size());
		Node stack1runner=stack1.top;
		
		while(stack1runner.next!=null){
			stack2.push(stack1runner.data);
			stack1runner=stack1runner.next;
		}
		stack3.push(stack1runner.data);
		
		while(stack2.top!=null){
			stack3.push(stack2.top.data);
			stack2.top=stack2.top.next;
		}
		return stack3;
		
	}
	


}
