package ctci;

public class ImplStack {

	 Node top;
	int min=-1;
	int maxSize=3;
	class Node
	{
		Node next=null;
		int data;
		
		public Node( int data){
		this.data=data;	
		}
	}
	void push(int abc)
	{
		Node node = new Node(abc);
		
		if(top==null)
		{
			
			top=node;
			
		}
		else
		{
			
			node.next=top;
			top=node;
		}
		
 	}
	 int pop()
	{
		Node localtop= top;
		top=top.next;
		return localtop.data;
		
		
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
	static int peek(ImplStack stack)
	{
		return stack.top.data;
	}
	
	

	
	
	
	
}
