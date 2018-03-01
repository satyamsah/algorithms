package naive;

public class ImplStack {

	Node top;
	int min=-1;
	int maxSize=3;
	class Node
	{
		Node next=null;
		int data;
		
		public Node( int data){
		this.data=data;	
		}
	}
	void push(int abc)
	{
		Node node = new Node(abc);
        
		if(top==null)
		{
			
			top=node;
			min=node.data;
		}
		else
		{
			if(min>node.data){
				min=node.data;
			}
			node.next=top;
			top=node;
		}
		
 	}
	
	 int pop()
	{
		Node localtop= top;
		top=top.next;
		return localtop.data;
		
		
	}
	 int peek(ImplStack stack)
	{
		return stack.top.data;
	}
	
	 int min(){
		return this.min;
		
	}
	 
     int size(){
    	int count=0;
    	Node runner=top;
    	while(runner!=null){
    		count++;
    		runner=runner.next;
    	}
    	return count;
    }
	


	
	
}
