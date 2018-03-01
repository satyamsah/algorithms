package ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class LLForDuplicateRemoval {

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
			System.out.print((char)curr.data+"->");
			curr=curr.next;
		}
	}
	
	 void removeDuplicate()
	{

		if(head!=null)
		{
			Node curr=head;
			Node prev=curr;
		//	ArrayList<Integer> arr= new ArrayList<>();
			Map<Character, Boolean> map = new HashMap<>();
			while(curr!=null)
			{
				if(map.containsKey((char)curr.data))//if(arr.contains(curr.data))
				{
					prev.next=curr.next;
					curr=curr.next;
				}
				else
				{
					map.put((char) curr.data, true);//arr.add(curr.data);
					prev=curr;
					curr=curr.next;
				}
			}
		}
		
	}
	 
	 void removeDuplicatewithO1SpaceComplexity()
		{

			if(head!=null)
			{
				Node curr=head;
				Node prev=curr;
				while(curr!=null)
				{
					Node runner=head;
					
					while(runner.next!=null)
					{
						if(runner.data==curr.data)
						{
							runner.next=curr.next;
							curr=curr.next;
						}
						else
						{
							runner=runner.next;
							curr=curr.next;
						}
					}
				}
			}
			
		}
	public static void main(String arr[])
	{
		LLForDuplicateRemoval rm = new LLForDuplicateRemoval();
		char[] abc="FOLLOW UP".toCharArray();
		
		for(char c: abc)
		{
			rm.insertfromEnd((char)c);
		
		}
		rm.display();
		
		rm.removeDuplicate();
		System.out.println("");
		rm.display();
		rm.removeDuplicatewithO1SpaceComplexity();
		System.out.println("");
		rm.display();
		
		
		
	}
}
