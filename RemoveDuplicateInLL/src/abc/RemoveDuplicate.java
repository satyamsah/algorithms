package abc;

import java.util.ArrayList;



public class RemoveDuplicate {

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
	
	void insertfromEnd(int data)
	{
		Node node= new Node(data);
		Node prev=head;
		Node curr=head;
		if(head==null)
		{
			head=node;
			curr=node;
		}
		while (curr!=null) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=node;
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
	
	 void removeDuplicate()
	{
		Node curr=head;
		Node prev=curr;
		if(head!=null)
		{
			ArrayList<Integer> arr= new ArrayList<>();
			while(curr!=null)
			{
				if(arr.contains(curr.data))
				{
					prev.next=curr.next;
				}
				else
				{
					arr.add(curr.data);
					
				}
			}
		}
		
	}
	public static void main(String arr[])
	{
		RemoveDuplicate rm = new RemoveDuplicate();
		rm.insertfromEnd(22);
		rm.insertfromEnd(44);
		rm.insertfromEnd(11);
		rm.display();
		
		 rm. removeDuplicate();
		 
		 rm.display();
		
		
	}
}
