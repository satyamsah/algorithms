package naive;


public class ImplQueue {

	static Node front;
	static Node last;
	class Node
	{
		Node next=null;
		int data;
		
		public Node( int data){
		this.data=data;	
		}
	}
	void add(int abc)
	{
		Node node = new Node(abc);
		if(front==null && last==null)
		{
			front=node;
			last=node;
		}
		else
		{
			
			last.next=node;
			last=node;
			System.out.println(last.data);
		}
 	}
	static int remove()
	{
		if(front==null)
		{
			return -1;
		}
		else
		{
		   Node temp=front;
		   front=front.next;
		   return temp.data;
		}
		
		
	}
	static int peek()
	{
		return front.data;
	}
	
	public static void main(String arr[])
	{
		ImplQueue queue= new ImplQueue();
		queue.add(12);queue.add(20);queue.add(22);queue.add(25);queue.add(27);
		System.out.println(peek());
		System.out.println(remove());
		System.out.println(peek());
		System.out.println(remove());
		System.out.println(peek());
		System.out.println(remove());
		System.out.println(peek());
		System.out.println(remove());
		System.out.println(peek());
		System.out.println(remove());
		System.out.println(peek());
	}
	
	
}
