package levelOrderTraversalEfficient;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static Node root;
	
	static class Node{
		Node left;
		Node right;
		int data;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	public static void traverseLineByLine(){
		
		if(root==null){
			return;
		}
		Queue<Node>  queue = new LinkedList<Node>();
		queue.add(root);
		
		while(true){
			
			
			int linesize=queue.size();
			if(linesize==0){
				break;
			}
			
			while(linesize>0){
				
				Node top= queue.peek();
				queue.remove();
				System.out.print(top.data+" ");
				if(top.left!=null){
					queue.add(top.left);
				}
				if(top.right!=null){
					queue.add(top.right);
				}
				linesize--;
				
			}
			System.out.println();
			
			
		}
		
	}
	
	
public static ArrayList<LinkedList<Integer>> arrofLL(){
		ArrayList<LinkedList<Integer>> arrayll= new ArrayList<>();;
		if(root==null){
			return null;
		}
		Queue<Node>  queue = new LinkedList<Node>();
		queue.add(root);
		
		int index=0;
		while(queue.size()!=0){
			int linesize=queue.size();
			LinkedList<Integer> ll2= new LinkedList<>();
			while(linesize>0){
				Node top= queue.peek();
				queue.remove();
				ll2.add(top.data);
				if(top.left!=null){
					queue.add(top.left);
				}
				if(top.right!=null)
				{
					queue.add(top.right);
				}
				linesize--;
				
			}
			System.out.println(ll2);
			System.out.println(index);
			arrayll.add(index,ll2);
			index++;
			System.out.println();
			
			
		}
		
		
		return arrayll;
		
	}

	public static void main(String[] str){
		//LevelOrderTraversal tree= new LevelOrderTraversal();
		root= new Node(33);
		root.left= new Node(22);
		root.right= new Node(44);
		root.left.right= new Node(55);
		root.left.left= new Node(66);
		root.right.right= new Node(44);
		traverseLineByLine();
		ArrayList<LinkedList<Integer>> arrayOfLL=arrofLL();
		
		for( int i =0;i<arrayOfLL.size(); i++){
			LinkedList<Integer> ll= arrayOfLL.get(i);
			for(int j=0;j< ll.size();j++){
				System.out.print(ll.get(j)+ " ");
			}
			System.out.println();
			
		}
		
	}
	
}
