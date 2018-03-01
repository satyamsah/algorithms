

public class LinkedList {
	
	static Node head;
	 class Node{
		 
		 Node next;
		 int val;
		public Node(int val) {
			this.val = val;
		}
		 
	 }
	
	public static void main(String []args){
		LinkedList ll= new LinkedList();
		ll.insertatEnd(22);
		ll.insertatEnd(33);
		ll.insertatEnd(88);
		ll.insertatEnd(44);
		ll.insertatEnd(99);
		
		
		ll.print(head);
	}

	private Node partitionUsingPivot(Node head,int pivot) {
		
		Node beforePivot=null;
		Node afterPivot=null;
		boolean isPivotFound=false;
		Node beforePivotEnd=null;
		Node curr=head;
		while(curr!=null){
			if(curr.val<pivot){
				if(beforePivot==null){
					beforePivot=curr;
					beforePivotEnd=curr;
				}else{
					curr.next=beforePivot;
					beforePivot=curr;
					
				}
			}
			else if (curr.val>pivot){
				if(afterPivot==null){
					afterPivot=curr;
				}else{
					curr.next=afterPivot;
					afterPivot=curr;
				}
			}
			else{
				isPivotFound=true;
			}
		}
		
		
		if(beforePivot==null){
			if(isPivotFound==true){
				Node node= new Node(pivot);
				node.next=afterPivot;
				afterPivot=node;
				return afterPivot;
			}else{
				return afterPivot;
			}
		}
		else{
				if(isPivotFound==true){
					Node node= new Node(pivot);
					beforePivotEnd.next=node;
					node.next=afterPivot;
				}
				return beforePivot;
			}
			
		}

	
private Node partitionUsingPivot2(Node head,int pivot) {
		
		Node beforePivot=null;
		Node afterPivot=null;
		Node beforePivotEnd=null;
		Node curr=head;
		while(curr!=null){
			if(curr.val<pivot){
				if(beforePivot==null){
					beforePivot=curr;
					beforePivotEnd=curr;
				}else{
					curr.next=beforePivot;
					beforePivot=curr;
					
				}
			}
			else if (curr.val>=pivot){
				if(afterPivot==null){
					afterPivot=curr;
				}else{
					curr.next=afterPivot;
					afterPivot=curr;
				}
			}
		}
		
		
		if(beforePivot==null){
			return afterPivot;
		}
		else{
				beforePivotEnd.next=afterPivot;
				return beforePivot;
			}
			
	}
	
	private void insertatEnd(int i) {
		if(head==null){
			head=new Node(i);
			
		}
		else{
			Node curr=head;
			Node prev=curr;
			while(curr!=null){
				prev=curr;
				curr=curr.next;
			}
			prev.next=new Node(i);
		}
		
	}
	private void print(Node head){
		Node curr=head;
		while(curr!=null){
			System.out.print(curr.val+"->");
			curr=curr.next;
		}
	}
	

}
