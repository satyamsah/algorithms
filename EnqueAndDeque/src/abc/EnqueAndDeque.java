package abc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class EnqueAndDeque {

	static class ImplQueue {
		
		
        static Stack<Map<String, String>> stack1;
        static Stack<Map<String, String>> stack2;
//		static Node front;
//		static Node last;
//		class Node
//		{
//			Node next=null;
//			Map<String, String> data;
//			
//			public Node( Map<String, String> data){
//			this.data=data;	
//			}
//		}
		
		
		void add(Map<String, String> data){
			stack1.push(data);
		}
		
		private void reversetheStack(){
			while(stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		void remove(){
			reversetheStack();
			stack2.pop();
			
		}
		void removeCat(){
			reversetheStack();
			Stack<Map<String, String>> temp;
			temp=stack2;
			Node runner=temp.top;
			Node prev=temp.top;
			while(!temp.runner.containsKey("Cat")){
				prev=runner;
				runner=runner.next;
			}
			prev.next=runner.next;
			
		}
		void removeDog(){
			reversetheStack();
			
		}
		
		void peek(){
			temp.peek();
		}
//		void add(Map<String, String> abc)
//		{
//			Node node = new Node(abc);
//			if(front==null && last==null)
//			{
//				front=node;
//				last=node;
//			}
//			else
//			{
//				
//				last.next=node;
//				last=node;
//				System.out.println(last.data);
//			}
//	 	}
//		 Map<String, String> remove()
//		{
//			if(front==null)
//			{
//				return null;
//			}
//			else
//			{
//			   Node temp=front;
//			   front=front.next;
//			   return temp.data;
//			}
//			
//			
//		}
//		 Map<String, String> peek()
//		{
//			return front.data;
//		}
		 
		RemoveCat(){
			
			while(peek().containsKey("Cat")){
				
			}
			
		}
		RemoveDog(){
			
		}
		
		
	}

    static ImplQueue queue;
    
    
	
    public static void main(String arr[])
	{
    	
    	Map<String ,String> map= new LinkedHashMap<String, String>();
    	map.put("dog", "Amana");
    	map.put("cat", "Joe");
    	map.put("cat", "Jakx");
    	map.put("dog", "race");
    	map.put("cat", "Husky");
    	int i=0;
		while(i<=map.size()-1){
			queue.add(map);
			i++;
		}
		
		System.out.println(queue.peek());
        
	}

}
