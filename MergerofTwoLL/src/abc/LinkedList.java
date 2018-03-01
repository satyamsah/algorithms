package abc;

import javax.swing.text.html.HTMLEditorKit.LinkController;

import abc.LinkedList.Node;

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
	
	static int sum(LinkedList ll1, LinkedList ll2)
	{
		int number1=0;
		int number2=0;
		if(ll1.head!=null)
		{
			 Node curr1=ll1.head;
			 int index=1;
			 
			 while(curr1!=null)
			 {
				 number1=number1+index*curr1.data;
				 index=index*10;
				 curr1=curr1.next;
			 }
			 System.out.println();
		}
		if(ll2.head!=null)
		{
			 Node curr2=ll2.head;
			 int index=1;
			 
			 while(curr2!=null)
			 {
				 number2=number2+index*curr2.data;
				 index=index*10;
				 curr2=curr2.next;
			 }
		}
	return number1+number2;
	  
	}
	
	public static void main(String arr[])
	{
		LinkedList ll1= new LinkedList();
		LinkedList ll2= new LinkedList();
		ll1.insertatEnd(7);
		ll1.insertatEnd(1);
		ll1.insertatEnd(6);
		ll1.display();
		//System.out.println(ll1.search(22));
		ll2.insertatEnd(9);
		ll2.insertatEnd(1);
		ll2.insertatEnd(2);
		//System.out.println(ll2.search(22));
		ll2.display();
		//ll.display();
		System.out.println(sum(ll1,ll2));
	}
}
