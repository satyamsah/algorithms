package naive;

public class ImplStack {

	static Node top;
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
			min=node.data;
		}
		else
		{
			if(min>node.data){
				min=node.data;
			}
			node.next=top;
			top=node;
		}
		
 	}
	static int pop()
	{
		Node localtop= top;
		top=top.next;
		return localtop.data;
		
		
	}
	static int peek(ImplStack stack)
	{
		return stack.top.data;
	}
	
	 int min(){
		return this.min;
		
	}
	

	
	public static void main(String arr[])
	{
		ImplStack stack= new ImplStack();
		stack.push(88);stack.push(8118);stack.push(8);stack.push(12);stack.push(44);
		System.out.println(peek(stack));
		System.out.println(pop());
		System.out.println(peek(stack));
		

		System.out.println(stack.min());
	}
	
	
}
