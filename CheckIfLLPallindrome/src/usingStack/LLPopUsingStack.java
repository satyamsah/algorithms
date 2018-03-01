package usingStack;

import java.util.Stack;




public class LLPopUsingStack {

	Node head;
	
	
	static boolean isPallindrome(Node head)
	{
		Stack<Node> stack = new Stack<>();
		Node fastNode=head;
		Node  slowNode=fastNode;
		while(fastNode.next!=null)
		{
			
			if(fastNode.next.next!=null)
			{
				stack.push(slowNode);
				slowNode=slowNode.next;
				fastNode=fastNode.next.next;
			}
			else 
			{
				stack.push(slowNode);
				fastNode=fastNode.next;
			}
		}
		Node temp=slowNode.next;
		while(temp!=null)
		{
			if(temp.data==stack.peek().data)
			{
				stack.pop();
			}
			else
			{
				return false;
			}
			temp=temp.next;
		}
		return true;
	}
	
	

	static public void display(Node head){
		//
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}
	}
	
//	void testIfPallindrome(Node head)
//	{
//		
//		Node curr=head;
//		while(slowNode.next!=null)
//		{
//			stack.push(slowNode);
//			slowNode=slowNode.next;
//			
//		}
//		stack.push(slowNode);
//		
//		while(fastNode!=null)
//		{
//			
//		}
//		
//	}
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
	
	 class Node{
		Node next=null;
		
		int data;
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	
	
	public static void main(String arr[])
	{
		LLPopUsingStack ll= new LLPopUsingStack();
		
		ll.insertatEnd(7);
		ll.insertatEnd(2);
		ll.insertatEnd(1);
		ll.insertatEnd(1);
		ll.insertatEnd(2);
		ll.insertatEnd(8);
		display(ll.head);
		System.out.println(isPallindrome(ll.head));
		
	}
}

