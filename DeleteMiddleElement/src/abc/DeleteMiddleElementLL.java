package abc;

class Node
{
	Node next=null;
	int data;
	public Node(int data)
	{
		this.data=data;
	}
}

public class DeleteMiddleElementLL {
	
	
	static Node head=null;
	

	static void insertinFront(int element)
	{
		Node node= new Node(element);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		
	}
	
	static void display(Node head)
	{
		 
		Node curr=head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}
	
	static boolean deleteMiddleElement(Node n)
	{
		if(n.next==null || n==null)
		{
			return false;
		}
		else
		{
			Node next=n.next;
			n.data=next.data;
			n.next=next.next;
			return true;
		}
	}
	public static void main(String args[])
	{
		DeleteMiddleElementLL ll= new DeleteMiddleElementLL();
		insertinFront(22);
		insertinFront(33);
		insertinFront(44);
		display(ll.head);
		Node node = new Node(33);
		System.out.println(deleteMiddleElement(node));
		display(ll.head);
	}

}
