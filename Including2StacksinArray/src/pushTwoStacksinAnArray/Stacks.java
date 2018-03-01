package pushTwoStacksinAnArray;


public class Stacks {
	 Node top;
	 int maxSize=3;
	 class Node
	{
		Node next=null;
		int data;
		
		public Node( int data){
		this.data=data;	
		}
	}
	 boolean push(int abc) throws StackOverflowError
	{
		Node node = new Node(abc);
		
		if(top==null)
		{
			
			top=node;
			return true;
			
		}
		else
		{
			
			node.next=top;
			top=node;
			if(size()>maxSize)
			{
				pop();
				return false;
			}
			return true;
			
		}
		
 	}
	 int size()
	{
		int count=0;
		while(top!=null)
		{
			count++;
			top=top.next;
		}
		return count;
	}
	 int pop()
	{
		Node localtop= top;
		top=top.next;
		return localtop.data;
		
		
	}

	public static void main(String[] args) {
		Stacks stack1= new Stacks();
		Stacks stack2= new Stacks();
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length/2;i++){
			System.out.println(stack1.push(arr[i]));
		}
		for(int i=arr.length/2;i<arr.length;i++){
			System.out.println(stack2.push(arr[i]));
		}
	//	Stacks stack= new Stacks();
//		System.out.println(stack.push(88));
//		System.out.println(stack.push(8118));
//		System.out.println(stack.push(78));
		//System.out.println(size(top));
		//System.out.println(stack.push(8));
		System.out.println(stack1.size());
		//System.out.println(pop());
	}

}
