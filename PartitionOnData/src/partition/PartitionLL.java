package partition;

import java.util.Arrays;

public class PartitionLL {


	static Node head=null;
	
	
	static void arrange(PartitionLL ll,int cardinalelement)
	{
		PartitionLL ll2= new PartitionLL();
		
		if(ll.head!=null)
		{	Node curr=ll.head;
			Node smaller=curr;
			Node larger=curr;
			while(curr!=null)
			{
				
				if(curr.data<cardinalelement)
				{
					insertinLast(ll2, cardinalelement);
				}
				if(curr.data>cardinalelement)
				{

					insertinLast(ll2, cardinalelement);
				}
			}
			
			
		}
		
	}
	
	static void insert( PartitionLL ll2, int data)
	{
		if(ll2.head==null)
		{
			ll2.head= new Node(data);
		}
		else
		{
			Node curr= ll2.head;
			Node prev=curr;
			while(curr!=null)
			{
				curr=curr.next;
				
			}
			prev=curr;	
			
		}
	}

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
	
	static void insertinLast(PartitionLL ll, int element)
	{
		
		if(ll.head==null)
		{
			ll.head=new Node(element);
		}
		else
		{
			Node node= new Node(element);
			Node curr=ll.head;
			Node prev=curr;
			while(curr!=null)
			{
				prev=curr;
				curr=curr.next;
			}
			prev.next=curr;
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
		PartitionLL ll= new PartitionLL();
		insertinFront(22);
		insertinFront(33);
		insertinFront(77);
		insertinFront(66);
		insertinFront(55);
		insertinFront(33);
		insertinFront(11);
		display(ll.head);
		arrange(ll,55);
		//Node node = new Node(33);
		//System.out.println(deleteMiddleElement(node));
		display(ll.head);
		
	}

	
}
class Node
{
	Node next=null;
	int data;
	public Node(int data)
	{
		this.data=data;
	}
}


	
	

