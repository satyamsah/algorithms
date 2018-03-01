package using2nodes;



public class LLMergeonCardinalElement {

	static Node head=null;
	static class Node
	{
		Node next=null;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	
	static void insertatEnd(int element)
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
	
	static void display(LLMergeonCardinalElement ll)
	{
		Node curr=ll.head;
		
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}
	
	static Node merge(LLMergeonCardinalElement ll , int cardinal )
	{
		LLMergeonCardinalElement ll2= new LLMergeonCardinalElement();
		Node beforeStartNode =null;
		Node afterStartNode=null;

		if(ll.head!=null)
		{
			Node curr=ll.head;
			int count=0;
			while(curr!=null)
			{
				if(curr.data<cardinal)
				{
					if(beforeStartNode==null)
					{
						beforeStartNode=curr;
						beforeStartNode.next=null;
						
					}
					else 
					{
						curr.next=beforeStartNode;
						beforeStartNode=curr;
						
					}
				}
				else if(curr.data>=cardinal)
				{
					
						if(afterStartNode==null)
						{
							afterStartNode=curr;
							afterStartNode.next=null;
							
						}
						else 
						{
								curr.next=afterStartNode;
								afterStartNode=curr;
							
						}
				}
				
					
				curr=curr.next;
			}
			if(beforeStartNode==null)
			{
				return beforeStartNode;
			}
			
			while(beforeStartNode.next!=null)
			{
				beforeStartNode=beforeStartNode.next;
			}
			beforeStartNode.next=afterStartNode;
			return beforeStartNode;
			
		}
		while(beforeStartNode.next!=null)
		{
			beforeStartNode=beforeStartNode.next;
		}
		beforeStartNode.next=afterStartNode;
		return beforeStartNode;
		
		
	}
	public static void main(String arr[])
	{
		LLMergeonCardinalElement ll= new LLMergeonCardinalElement();
		insertatEnd(22);
		insertatEnd(33);
		insertatEnd(77);
		insertatEnd(66);
		insertatEnd(55);
		insertatEnd(33);
		insertatEnd(11);
		
		display(ll);
		Node n= merge(ll,55);
		Node curr=n;
		while (curr!=null) {
			
			System.out.print(curr.data);
			if(curr.next!=null)
			{
				System.out.print("->");
			}
			curr=curr.next;
		}
		display(ll);
	}
}
