package abc;


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
	void insertinFront(int element)
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
	
	void insertBeforeAnElement(int currdata,int newdata)
	{
		Node curr=head;
		Node prev=curr;
		Node newNode= new Node(newdata);
		while(curr!=null)
		{
			if(head.data==currdata)
			{
				newNode.next=head;
				head=newNode;
				break;
			}
			
			else if(curr.data==currdata)
			{
				prev.next=newNode;
				newNode.next=curr;
				break;
			}
			else
			{
				prev=curr;
				curr=curr.next;
			}
		}
	}
	void insertAfteranElement( int currdata, int newdata)
	{
		Node curr= head;
		Node prev=curr;
		Node node= new Node(newdata);
		while(curr!=null)
		{
			if(curr.data==currdata)
			{
				Node nextNode=curr.next;
				curr.next=node;
				node.next=nextNode;
				break;
			}
			else
			{
				curr=curr.next;
			}
			
		}
	}

	
	int findThrirdLast()
	{
		Node currentNode=head;
		Node prev=currentNode;
		int count=0;
		while(currentNode!=null)
		{
			count=count+1;
			if(count>3)
			{
				prev=prev.next;
				System.out.println(prev.data);
				
			}
			currentNode=currentNode.next;
			
		}
		if(count<=3)
		{
			return -1;
		}
		return prev.data;
		
	}
	
	
	
	void deletefromFirst()
	{
		Node curr=head;
		head=curr.next;
		
	}
	void deletefromLast()
	{
		Node curr=head;
		Node prev=curr;
		
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=curr.next;
		

	}
	
	void deleteanElement(int data)
	{
		Node curr=head;
		Node prev=curr;
		
		while(curr!=null)
		{
			
			if(head.data==data)
			{
				head=head.next;
				break;
			}
			if(curr.data==data)
			{
				prev.next=curr.next;
				break;
			}
			prev=curr;
			curr=curr.next;
		}
	}
	
//	void deleteBeforeElement(int data)
//	{
//		Node curr=head;
//		Node prev=curr;
//		Node prevprev=prev;
//		while(curr!=null)
//		{
//			
//			if(prev.data==data)
//			{
//				prevprev.next=curr;
//				break;
//			}
//			prevprev=prev;
//			prev=curr;
//			curr=curr.next;
//		}
//	}
//	
//	void deleteAfterElement(int data)
//	{
//		Node curr=head;
//		Node prev=curr;
//		while(curr!=null)
//		{
//			
//		}
//	}
	public static void main(String arr[])
	{
		LinkedList ll= new LinkedList();
		
		ll.insertatEnd(22);
	ll.insertatEnd(33);
		ll.insertatEnd(44);
		
		//ll.insertinFront(22);
		//ll.insertinFront(33);
		//ll.insertinFront(44);
		System.out.println(ll.search(22));
		ll.display();
		ll.insertBeforeAnElement(44, 11);
		System.out.println("------------------");
		ll.display();
		ll.insertAfteranElement(22, 55);
		System.out.println("------------------");
		ll.display();
		
		System.out.println();
		System.out.println(ll.findThrirdLast());
		//ll.deletefromFirst();
		//ll.deletefromLast();
		ll.deleteanElement(11);
		ll.display();
		
		//System.out.println(ll.search(66));
	}
}
