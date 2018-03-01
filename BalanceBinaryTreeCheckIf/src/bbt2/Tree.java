package bbt2;

class Node{
	Node left=null;
	Node right= null;
	int data;
	
	public Node(int data){
		this.data=data;
	}
}

public class Tree {
	
	Node root;

	
	static int getHeight(Node node){
		if(node==null){
			return 0;
		}
		return Math.max(getHeight(node.left), getHeight(node.right))+1;
		
	}
		
	
	static boolean isBalanced(Node root){
	
	    if(root==null){
	    	return true;
	    }
	    int heightdiff=getHeight(root.left)-getHeight(root.right);
		if(heightdiff>1 ||heightdiff<-1 ){
			return false;
		}
		else{
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		
		
		System.out.println(isBalanced(root));
		System.out.println(getHeight(root));
	}

}
