package naive;




public class LinkedList {

	Node head=null;
	class Node
	{
		Node next=null;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	
	boolean search (int abc)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			if(curr.data==abc)
			{
				return true;
			}
			else
			{
				curr=curr.next;
			}
		}
		return false;
	}
	void insertatEnd(int element)
	{
		Node node= new Node(element);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node curr=head;
			Node prev=curr;
			while (curr!=null) {
				prev=curr;
				curr=curr.next;
			}
			prev.next=node;
			node.next=null;
		}
	}
	
	
	void createcircularLL(LinkedList ll)
	{
		if(ll.head!=null)
		{
			Node curr= ll.head;
			while(curr.next!=null)
			{
				System.out.print(curr.data);
				curr=curr.next;
				if(curr.next!=null)
				{
					System.out.print("->");
				}
				
			}
			System.out.print("->"+curr.data+"->");
			curr.next=head;
			System.out.print(curr.next.data);
		}
	}
	
	void display()
	{
		Node curr=head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}
	
	
	
	public static void main(String arr[])
	{
		LinkedList ll1= new LinkedList();
		LinkedList ll2= new LinkedList();
		ll1.insertatEnd(7);
		ll1.insertatEnd(1);
		ll1.insertatEnd(6);
		//ll1.display();
		//System.out.println(ll1.search(22));
		ll1.insertatEnd(9);
		ll1.insertatEnd(1);
		ll1.insertatEnd(2);
		//System.out.println(ll2.search(22));
		//ll1.display();
		System.out.println("");
		ll1.createcircularLL(ll1);
		
	}
}
