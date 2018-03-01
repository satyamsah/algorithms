
import java.util.Stack;



public class SortAStack {

	 Stack<Integer> sort(  Stack<Integer> s1){
			Stack<Integer> tempStack=new Stack<>();
			
			int temp=Integer.MAX_VALUE;
			while(!s1.isEmpty()){
				temp=s1.pop();
				if(tempStack.size()==0){		
					tempStack.push(temp);
				}else{
					if(temp<=tempStack.peek()){
						tempStack.push(temp);
					}else{
						while(!tempStack.isEmpty() && tempStack.peek()<temp){
							s1.push(tempStack.pop());
						}
						tempStack.push(temp);
					}
				}
			}
			return tempStack;
			
		}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.add(34);
		stack.add(3);
		stack.add(31);
		stack.add(98);
		stack.add(23);
		SortAStack s= new SortAStack();
		Stack<Integer > s2= s.sort(stack);
//		Object[] arr= s2.toArray();
//		for( Object a: arr){
//			System.out.println(a);
//		}
		while(s2.isEmpty()){
			System.out.println(s2.pop());
		}
		
	}

}
