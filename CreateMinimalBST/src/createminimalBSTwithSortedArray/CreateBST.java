package createminimalBSTwithSortedArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.sound.midi.Synthesizer;

public class CreateBST {

	static Node root;
	static class Node{
	
		Node left,right=null;
		int data;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public static void main(String [] arr){
		
		//System.out.println(5/2);
		int[] array= {6,7,8,9,10};
		
		Node node=createBST(array);
		
		levelOrderTraversal(node);
		
	}

	private static void levelOrderTraversal(Node root) {
		
		Queue<Node> queue= new LinkedList<>();
		queue.add(root);
		
		while(queue.size()!=0){
			int linesize=queue.size();
			
			while(linesize!=0){
				Node node  = queue.poll();
				System.out.print(node.data+"\t");
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);
				linesize--;
			}
			System.out.println();
			
			
		}
		
	}

	private static Node createBST(int[] array) {
		
		
		Node node= createBSTUtil(array,0,array.length-1);
		return node;
		
	}

	private static Node createBSTUtil(int[] array, int start, int end) {
		System.out.println("start:"+start+"::"+"end:"+end);
		if(end<start){
			return null;
		}
		
		
		int middleindex= (start+end)/2;
		System.out.println("middleindex"+middleindex);
		Node node= new Node(array[middleindex]);
		System.out.println(node.data);
		
		
		node.left=createBSTUtil(array, start,middleindex-1);
		node.right=createBSTUtil(array, middleindex+1,end);
		return node;
		
	}
	
}
