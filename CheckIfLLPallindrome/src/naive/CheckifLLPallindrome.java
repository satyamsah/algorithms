package naive;

public class CheckifLLPallindrome {

	Node head=null;
	class Node
	{
		Node next=null;
		Node prev=null;
		int data;
		public Node(int data)
		{
			this.data=data;
		}
		
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
	
	
	static Node reverseIterative(Node head){
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");
		display(head);
		return head;
		
	}
	
	static public void display(Node head){
		//
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
//	void display()
//	{
//		Node curr=head;
//		
//		while(curr!=null)
//		{
//			System.out.print(curr.data+"->");
//			curr=curr.next;
//		}
//	}
	
	static boolean checkIfPallindrome(Node headfromStart, Node headfromEnd)
	{

		while(headfromStart!=null && headfromEnd!=null)
		{
			if(headfromEnd.data==headfromStart.data)
			{
				headfromStart=headfromStart.next;
				headfromEnd=headfromEnd.next;
				continue;
			}
			else {
				return false;
			}
					
		}
		return true;
		
		
	}
	

	

	
	public static void main(String[] args) {
		CheckifLLPallindrome ll= new CheckifLLPallindrome();
		ll.insertatEnd(7);
		ll.insertatEnd(1);
		ll.insertatEnd(7);
		Node headfromStart=ll.head;
		display(ll.head);
		
		
		Node headfromEnd=reverseIterative(ll.head);
		//ll.display();
		
		System.out.println(checkIfPallindrome(headfromStart,headfromEnd));

	}

}
