package using4nodes;



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
		Node startBeforeNode =null;
		Node endBeforeNode=null;
		Node startAfterNode =null;
		Node endAfterNode=null;
		
		if(ll.head!=null)
		{
			Node curr=ll.head;
			int count=0;
			while(curr!=null)
			{
				if(curr.data<cardinal)
				{
					if(startBeforeNode==null)
					{
						startBeforeNode=curr;
						System.out.println(startBeforeNode.data);
						
					}
					else 
					{
						if(endBeforeNode==null)
						{
							endBeforeNode=startBeforeNode.next;
							System.out.println(endBeforeNode.data);
						}
						else
						{
							
							endBeforeNode.next=curr;
							endBeforeNode=curr;
							System.out.println(endBeforeNode.data);
						}	
						
					}
				}
				else if(curr.data>=cardinal)
				{
					
						if(startAfterNode==null)
						{
							startAfterNode=curr;
							System.out.println(startAfterNode.data);
						}
						else 
						{
							if(endAfterNode==null)
							{
								endAfterNode=startAfterNode.next;
								System.out.println(endAfterNode.data);
							}
							else
							{
								endAfterNode.next=curr;
								endAfterNode=curr;
								System.out.println(endAfterNode.data);
							}	
						}
					}
					
				curr=curr.next;
			}
			
			if(endBeforeNode==null)
			{
				endBeforeNode=startBeforeNode;
			}
			
			if(endAfterNode==null)
			{
				endAfterNode=startAfterNode;
			}
		}
		endBeforeNode.next=startAfterNode;
		endAfterNode.next=null;
		return startBeforeNode;
		
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
		//display(ll);
	}
}
