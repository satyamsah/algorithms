package bbtefficient;


public class BalancedBinaryTree {

	Node root=null;
	static class Node{
		Node left=null;
		Node right=null;
		int data=0;
		Node(int data){
			this.data=data;
		}
		
	}
	
	
	static int getHeight(Node node){
	
		if(node==null){
			return 0;
		}
		
			int leftHeight= getHeight(node.left);
			if(leftHeight==-1){
				return -1;
			}
			
			int rightHeight= getHeight(node.right);
			if(leftHeight==-1){
				return -1;
			}
			if(Math.abs(leftHeight-rightHeight)>1){
				return -1;
			}
			else{
				return Math.max(leftHeight, rightHeight) + 1;
			}
			
		
		
	}
	static Boolean checkIfBalanced(Node root){
		if(getHeight(root)==-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		System.out.println(checkIfBalanced(root));
	}
}
